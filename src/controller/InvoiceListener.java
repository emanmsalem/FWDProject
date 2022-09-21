/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import controller.HeaderTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.InvoiceHeader;
import model.InvoiceLine;
import view.InvoiceGeneratorFrame;

/**
 *
 * @author Eman
 */
public class InvoiceListener implements ActionListener, ListSelectionListener {

    private InvoiceGeneratorFrame frame;
    
    public InvoiceListener(InvoiceGeneratorFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*String actionCommand = e.getActionCommand();
        switch (actionCommand)
        {
            case "Load File":
                loadFile(null,null);
                break;
            case "Save File":
                saveFile();
                break;
            case "Create Invoice":
                createInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Save":
                saveItem();
                break;
            case "Cancel":
                cancelItem();
                break;
        }*/
    }
/*
    public void loadFile(String headerPath, String linePath) {
        File headerFile = null;
        File lineFile = null;
        
        if (headerPath == null && linePath == null)
        {
            JOptionPane.showMessageDialog(frame, "Select header file, then select line file","Invoice files", JOptionPane.WARNING_MESSAGE);
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION )
            {
                headerFile = fc.getSelectedFile();
                result = fc.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION)
                {
                    lineFile = fc.getSelectedFile();
                }
            }
        }else
        {
            headerFile = new File(headerPath);
            lineFile = new File(linePath);
        }
        
        if (headerPath != null && linePath != null)
        {
                try {
                    List<String> headerLines = Files.lines(Paths.get(headerFile.getAbsolutePath())).collect(Collectors.toList());
                    
                    List<String> lineLines = Files.lines(Paths.get(lineFile.getAbsolutePath())).collect(Collectors.toList());
                    frame.getInvoices().clear();
                    for (String headerLine : headerLines)
                    {
                        String[] parts = headerLine.split(",");
                        String numString = parts[0];
                        String dateString = parts[1];
                        String name = parts[2];
                        int num = Integer.parseInt(numString);
                        Date date = frame.sdf.parse(dateString);
                        InvoiceHeader inv = new InvoiceHeader(num, name, date);
                        frame.getInvoices().add(inv);
                    }
                    for (String lineLine : lineLines)
                    {
                        String[] parts = lineLine.split(",");
                        int num = Integer.parseInt(parts[0]);
                        String name = parts[1];
                        double price = Double.parseDouble(parts[2]);
                        int count = Integer.parseInt(parts[3]);
                        InvoiceHeader inv = frame.getInvoiceByNum(num);
                        InvoiceLine line = new InvoiceLine(name, price, count, inv);
                        inv.getLines().add(line);
                    }
                    frame.setHeaderTableModel(new HeaderTableModel(frame.getInvoices()));
                    //frame.getInvoicesTable().setModel(new HeaderTableModel());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        }

            
    }

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cancelItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
