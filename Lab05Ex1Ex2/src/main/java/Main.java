/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Começa a Thread");
        
        Ola s1 = new Ola();
        BemVindo s2 = new BemVindo();
        
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Termina a Thread");
    }
}
