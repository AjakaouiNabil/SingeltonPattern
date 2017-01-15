/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singeltonpattern;

/**
 *
 * @author nab
 */
public class Counter {
    private static volatile Counter instance;
    private static int teller;
    private Counter(){
        teller = 0;
    }

    public static int getTeller() {
        return teller;
    }
    
    public static  Counter getInstance(){
        if (instance == null) {
                synchronized(Counter.class){ 
                 if(instance == null) {
                    instance = new Counter();
                    teller ++;
                 }
            }
        }
        return instance;
        
    }
}
