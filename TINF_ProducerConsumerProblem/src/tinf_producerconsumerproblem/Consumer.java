/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinf_producerconsumerproblem;


import java.util.logging.Level;
import java.util.logging.Logger;
import static tinf_producerconsumerproblem.TINF_ProducerConsumerProblem.N;
import static tinf_producerconsumerproblem.TINF_ProducerConsumerProblem.count;
import static tinf_producerconsumerproblem.TINF_ProducerConsumerProblem.prodThread;
import static tinf_producerconsumerproblem.TINF_ProducerConsumerProblem.remove;


/**
 *
 * @author Doris Lehner
 */
public class Consumer extends Thread {
    
   @Override
        public void run(){
        while (true) {
            System.out.println("Cons:Ich bin wach");
            if (count <= 0) {
                System.out.println("Cons:Ich gehe schlafen");
                try {
                    synchronized(this){ wait(); }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            remove();
            if (count >= N-1) {
                synchronized(prodThread){ prodThread.notify();}
            }
        } 
}
}
