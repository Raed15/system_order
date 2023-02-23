import java.util.ArrayList;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class item extends myframe {

    ArrayList<Double> item = new ArrayList<Double>();// array list from the item 
    
    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==meatButton){ // event the button meat

        String qty = JOptionPane.showInputDialog(null, "please enter your quantity");
        Double tqty = Double.valueOf(qty);

            Double price = 16.0;
            Double tot_price1 = price*tqty;
            item.add(tot_price1);

        }

        if (e.getSource()==chickenButton){ // event the button chicken 

            
        String qty = JOptionPane.showInputDialog(null, "please enter your quantity");
        Double tqty = Double.valueOf(qty);
        
            Double price = 14.0;
            Double tot_price = price*tqty;
            item.add(tot_price);
        }


        if(e.getSource()==juiceButton){ // event the button juice 

                
        String qty = JOptionPane.showInputDialog(null, "please enter your quantity");
        Double tqty = Double.valueOf(qty);
        
            Double price = 3.0;
            Double tot_price2 = price*tqty;
            item.add(tot_price2);
           
        

        }

        if (e.getSource()==calcButton){ // event the button calculate 
                double sum = 0 ;
               for ( int i=0; i <item.size();i++){
                sum+=item.get(i);
                
                System.out.println("Total:"+sum);
               }
            
             
        }
        
    }
    
}
