/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package time;

import com.sun.tools.javac.Main;

/**
 *
 * @author Muskan
 */
public class time {
    
    
   int hours , mins;
    int totalHours=0;
    int remainingMins=0;
   time(){ } //default constr
   time(int hours, int mins){
       this.hours=hours;
       this.mins=mins;
   }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getHours() {
        return hours;
    }

    public int getMins() {
        return mins;
    }
    
   
    public void String(){
        while(mins>=60){
           
           hours=hours+1;
           mins=mins-60;
           remainingMins+=mins;
           totalHours=hours;
            
        }
        
        
        if (mins<60){
            totalHours=hours;
            remainingMins=mins;   
    }
        System.out.println("Total hours" +totalHours +"and mins"+remainingMins);

    }
}