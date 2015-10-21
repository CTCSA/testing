package p3;

import java.util.*;
import java.io.*;

/**
 *
 * @author ckc
 */
public class CircleCreator extends ShapeCreator{

    Vector _shapes = new Vector();
    boolean cont = true;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    public Shape CreateShape()throws IOException{

        
            System.out.println("Enter radius:");
            String line = br.readLine();
        
        return new Circle(0,0,Integer.parseInt(line));
       
    }
        
        
//
        
        
}
