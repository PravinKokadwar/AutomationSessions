
package ExceptionHandling;

import java.io.*;

public class NullPointerException2 {

	public static void main (String[] args) 
    { 
        // Initializing String variable with null value 
        String ptr = null; 
 
        // Checking if ptr.equals null or works fine. 
        try
        { 
            // This line of code throws NullPointerException 
            // because ptr is null 
            if (ptr.equals("nokia")) 
                System.out.print("Same"); 
            else
                System.out.print("Not Same"); 
        } 
        catch(Exception e) 
        { 
            //System.out.println(e); 
            e.printStackTrace();
        } 
    } 

}
