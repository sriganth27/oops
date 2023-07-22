/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Admin
 */
package oops;
public enum Day {
    SUNDAY, MONDAY, TUESDAY, 
    SATURDAY
            {
        public void days(){
            System.out.println("special day");
        }
    },WEDNESDAY , THURSADAY, FRIDAY,;
        public void days(){
            System.out.println("average day");
        }
    
}
