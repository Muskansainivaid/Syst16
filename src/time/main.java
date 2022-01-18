/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package time;

import java.util.Scanner;

/**
 *
 * @author Muskan
 */

public class main {
    int a,b,c;
   
    public static void main(String args[]){
        
         Scanner sc=new Scanner(System.in);
          System.out.println("Enter the hours");
         int hours=sc.nextInt();
         
         System.out.println("Enter the mins");
         int mins=sc.nextInt();
         
         
         time obj=new time();
         obj.setHours(hours);
         obj.setMins(mins);
         obj.String();
         
        
    }
    
    
    
   
}
//