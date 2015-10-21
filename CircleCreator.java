/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_part3;


import java.util.*;
import java.io.*;

/**
 *
 * @author a1
 */
public class CircleCreator extends ShapeCreator{

    Vector _shapes = new Vector();
    boolean cont = true;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    public Shape CreateShape()throws IOException{
 
            
           // int command = Integer.parseInt(line);
            System.out.println("Enter radius:");
            String line = br.readLine();
            //line = br.readLine(); 
            int r = Integer.parseInt(line);
            //Shape s = new Circle(0, 0, r);
            //_shapes.add(s);
        
        return new Circle(0,0,r);
       
    }
        
        
        /*
        try {
            while (cont) {
                System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
                String line = br.readLine();
                int command = Integer.parseInt(line);
                if (command == 0) {
                    cont = false;
                } else if (command == 1) {

                    for (int i = 0; i < _shapes.size(); i++) {
                        ((Shape) _shapes.elementAt(i)).draw();
                    }

                } else if (command == 2) {

                    System.out.println("Enter radius:");
                    line = br.readLine();
                    int r = Integer.parseInt(line);
                    Shape s = new Circle(0, 0, r);
                    _shapes.add(s);
                }
            }
                }catch(Exception e){
                    e.printStackTrace();
                }
            return null;
    }*/
        
        
}
    
