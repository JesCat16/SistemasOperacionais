/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Criando threads");
        
        Exec exec1 = new Exec();
        Thread t1 = new Thread(exec1);
        t1.start();
        
        Exec exec2 = new Exec();
        Thread t2 = new Thread(exec2);
        t2.start();
    }
}
