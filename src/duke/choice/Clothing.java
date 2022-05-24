/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author g.alves.pereira
 */
public class Clothing implements Comparable<Clothing> {
    
    private String description;
    private double price;
    private String size = "M";
    private int iD;
    private Clothing[] items;
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;
        
    public Clothing(String description, double price, int size, int iD) {
        this.description = description;
        setPrice(price);
        setSize(size);
        setiD(iD);
    }
           
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void setPrice(double price) {
        this.price = (price>=MIN_PRICE)? price : MIN_PRICE;
    }

    public double getPrice() {
        return price * (TAX_RATE +1);
    }
    
    public String getSize() {
        return size;
    }

    public int getiD() {
        return this.iD;
    }

    private void setiD(int aId) {
         this.iD = aId;
    }
        
    private String setSize(int m){
        switch(m){
            case 1: 
            case 2: 
            case 3:
                return this.size = "S";
            case 4: 
            case 5: 
            case 6:
                return this.size = "M";
            case 7: 
            case 8: 
            case 9:
                return this.size = "L";
            default:
                return this.size = "X";
        }
    }
    
    @Override /*that indicates that a subclass method is overiden a superclass method by polimorfism*/
    public String toString(){
            return ("-"+getDescription()+", item price: "
                +getPrice()+", item size: "+getSize()+"!"+getiD());
        }

    @Override // here we implement the compareTo method from the interface comparable, to sort the items.
    public int compareTo(Clothing o) {
        return this.size.compareTo(o.size);
    }
    
    }
    

