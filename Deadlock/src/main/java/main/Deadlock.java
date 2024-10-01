/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author unifjjesus
 */
public class Deadlock {
    public static void main(String[] args) {
        Object recurso1 = new Object();
        Object recurso2 = new Object();
    
        Thread t1 = new Thread(new Exemplo(recurso2,recurso1));
        Thread t2 = new Thread(new Exemplo(recurso1,recurso2));
        
        t1.start();
        t2.start();
    }   
        
}
