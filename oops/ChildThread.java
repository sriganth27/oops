package oops;

import java.util.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ChildThread extends Thread {
    public void run(){
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("my sleep got distrupted");
                //ex.printStackTrace();
            }
            System.out.println("child thread"+i);   
        }
    }
    
}
