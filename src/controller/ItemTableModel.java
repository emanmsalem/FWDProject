/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import model.InvoiceLine;

/**
 *
 * @author Eman
 */
public class ItemTableModel extends DefaultTableModel{

    private String[] columns = {"Item Name","Item Price","Count","Item Total"};
    private ArrayList<InvoiceLine> invoiceLines;
    
    
    public ItemTableModel(ArrayList<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
    
    @Override
    public int getRowCount() {
        if(this.invoiceLines==null){
        invoiceLines =new  ArrayList<>();
        }
        return invoiceLines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public String getColumnName (int column){
        return columns[column];
    }
    
    @Override
    public void removeRow(int row) {
      invoiceLines.remove(row);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         InvoiceLine inv = invoiceLines.get(rowIndex);
        switch(columnIndex){
            case 0:
                return inv.getName();
            case 1:
                return inv.getPrice();
            case 2:
                return inv.getCount();
            case 3:
                return inv.getTotal();
            default:
                return"";
        }
    }
    
    public ArrayList<InvoiceLine> getInvoices() {
        return invoiceLines;
    }
    
}
