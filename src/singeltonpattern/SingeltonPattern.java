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
public class SingeltonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
            Counter.getInstance();
            System.out.println(Counter.getTeller());
        }
        
    }
    
}
