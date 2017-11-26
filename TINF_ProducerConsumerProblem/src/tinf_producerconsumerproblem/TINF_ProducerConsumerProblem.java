/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinf_producerconsumerproblem;


import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Doris Lehner
 */
public class TINF_ProducerConsumerProblem {

    public static final int N = 100;
    public static int count = 5;
    public static Producer prodThread = new Producer();
    public static Consumer consThread = new Consumer();
    public static void main(String[] args){
        prodThread.start();
        //prodThread.run();
        consThread.start();
        //consThread.run();
       
        //System.out.println("Im Done");
    }

    public static void insert_item(){
        count++;
    }
    public static void remove(){
        count--;
}
}
