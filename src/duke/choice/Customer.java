/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author g.alves.pereira
 */
public class Customer{
    
    private String name;
    private String size;
    private Clothing[] items;
    private int measurement;
    private double total;
    private int iD = 0;
    
    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public int getMeasurement() {
        return measurement;
    }
   
    public Clothing[] getItems() {
        return items;
    }
      
    public void addItems (Clothing[] items){
                                  
        this.items = items;

    }

    public String getName() {
        return name;
    }
           
    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }
            
    private void setSize(int m){
        switch(m){
            case 1: 
            case 2: 
            case 3:
                size = "S";
                break;
            case 4: 
            case 5: 
            case 6:
                size = "M";
                break;
            case 7: 
            case 8: 
            case 9:
                size = "L";
                break;
            default:
                size = "X";
                break;
        }
    }
            public double getTotalClothingCost(){
            for(Clothing item: items){
                if(getSize().equals(item.getSize())){
                
                    total += item.getPrice();
                
                } 
            }
                return total;
        }

    }
          

