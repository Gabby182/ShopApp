/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;




/**
 *
 * @author g.alves.pereira
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                       
        System.out.println("**Welcome to Duke Choice Shop!**\n");
        System.out.println("******Minimun shop: " + Clothing.MIN_PRICE+"******\n\n");
              
        Customer c1 = new Customer("Pink", 3);
        c1.setName("Pinky");
        
        Clothing item1 = new Clothing("Blue Jacket", 20.9,3,1);
        Clothing item2 = new Clothing("t-Shirt", 8.0, 6,2);
        Clothing item3 = new Clothing("Green Scarf", 10.0,9,3);
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, 12,4);
        Clothing[] items = {item1, item2, item3, item4};
        
        c1.addItems(items);
        
        System.out.println("Customer: " +c1.getName() +" ,Size: " +
                    c1.getSize() +" ,The cost is: " + c1.getTotalClothingCost());
                
        System.out.println("\nItems description: \n");
        
        for(Clothing item: c1.getItems()){
            
            System.out.println("-"+ item.toString());
        
        }
        
        double average;
        
        try{
        
        //average = 0/0;   
        average = (c1.getTotalClothingCost())/c1.getItems().length;
        System.out.println("\nThe average: "+average);
        
        }catch(ArithmeticException e){
             System.out.println("\nDon´t divide by 0");
        }finally{
        
            System.out.println("\nFinal\n");
            
        }
        
        System.out.println("Sorting the items: \n");
        // Sorting the array by compareTo from comparable
        Arrays.sort(c1.getItems());
         
        for(Clothing item: c1.getItems()){
            
            System.out.println("-"+ item.toString());
        
        }
        
       /* try{
        ItemList list = new ItemList(items);
        
        Routing routing = Routing.builder().get("/items", list).build();
        
        ServerConfiguration config = new ServerConfiguration.builder()
                .bindAddress(InetAddress.getLocalHost()).port(8888).build();
        
        WebServer ws = new WebServer.create(config, routing);
        
        ws.start();
        }catch(UnknownHostException ex){
            ex.printStackTrace();
        } */
               
    }
        
        
}
