/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassingment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author ACHOR
 */
public class generateNumber2 {       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int k = 1;
        
        File numfile = new File("numFile.txt");
        
        if (numfile.exists() == false) {
            numfile.createNewFile();
                System.out.println("The file has been created");
            } else {
                System.out.println("The File alresdy exists");
            }
                
        long start = System.currentTimeMillis();
        for(int i = 1; i <= 420000; i++) {
                        
            
            if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0) {
                                
                
                FileWriter filewriter = new FileWriter(numfile, true);
                PrintWriter printwriter = new PrintWriter(filewriter); 
    
              
        
                printwriter.println("No "+ k++ + "== "+ i);
                printwriter.close();            
                                
            }          
        }       
        long end = System.currentTimeMillis();
        System.out.println("Difference :" + (end - start));
    }  
    
}
