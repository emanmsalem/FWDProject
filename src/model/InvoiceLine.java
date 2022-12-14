/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Eman
 */
public class InvoiceLine {
    private String name;
    private double price;
    private int count;
    private double lineTotal;
    private InvoiceHeader inv;

    public InvoiceLine( String name, double price, int count, InvoiceHeader inv) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.inv = inv;
        this.setLineTotal(this.count*this.price);
    }

  public double getTotal()
  {
      return price*count;
  }
    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "name=" + name + ", price=" + price + ", count=" + count + ", inv=" + inv + '}';
    }
    
    

}
