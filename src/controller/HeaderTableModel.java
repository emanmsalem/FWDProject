/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import model.InvoiceHeader;
import view.InvoiceGeneratorFrame;

/**
 *
 * @author Eman
 */
public class HeaderTableModel extends DefaultTableModel{

    private String[] columns = {"Invoice Num","Invoice Date","Customer Name","Invoice Total"};
    private ArrayList<InvoiceHeader> invoices;
    
    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
        this.columns = columns;
        this.invoices = invoices;
    }
            
    @Override
    public int getRowCount() {
        if(this.invoices ==null){
         invoices=new  ArrayList<>();
        }
        return invoices.size();
    }

    @Override
    public String getColumnName (int column){
        return columns[column];
    }
    
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public void removeRow(int row) {
    invoices.remove(row);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader inv = invoices.get(rowIndex);
        switch(columnIndex){
            case 0:
                return inv.getNum();
            case 1:
                return InvoiceGeneratorFrame.sdf.format(inv.getDate());
            case 2:
                return inv.getName();
            case 3:
                return inv.getTotal();
            default:
                return"";
        }
    }
    
    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }
}
