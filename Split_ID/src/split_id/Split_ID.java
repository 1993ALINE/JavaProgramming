/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split_id;

import java.util.Scanner;

/**
 *
 * @author ALINE
 */
public class Split_ID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mymethod();
    }

    private static void mymethod() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter Your Student ID :");
    String Result = i.nextLine();
    
    String year = Result.substring(0,4);
    System.out.println("Student Year : " + year);
    
    String id = Result.substring(12,13);
    System.out.println("Last four digits of id : " + id);
    
    
    
    String semester = Result.substring(4,6); 
    if (semester.contains("00")){
        System.out.println("Semester : Spring");
    }else if (semester.contains("10")){
        System.out.println("Semester : Summer");
    }else if (semester.contains("20")){
        System.out.println("Semester : Fall");
}
        
    }
}
    
    

   
