/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;


/**
 *
 * @author ardzix
 */
public class PrintJob implements Printable, ActionListener {
 
    private List<String> text;
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
 
        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }
 
        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
        /* Now we perform our rendering */
        
        g.drawString("HeXa Hospital Management System", 20, 20);
        g.drawString("===============================", 20, 40);
        for(int i=0; i<this.text.size(); i++){        
            g.drawString(this.text.get(i), 20, (i+3)*20);
        }
 
        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }
    
    public void set_text(List<String> text){
        this.text = text;
    }
 
    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
    }
 
    public static void main(String args[]) {
  
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        JFrame f = new JFrame("Hello World Printer");
        f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JButton printButton = new JButton("Print Hello World");
        printButton.addActionListener(new PrintJob());
        f.add("Center", printButton);
        f.pack();
        f.setVisible(true);
    }


}