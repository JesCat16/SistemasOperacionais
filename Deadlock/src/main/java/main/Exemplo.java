/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author unifjjesus
 */
public class Exemplo implements Runnable{
    Object r1;
    Object r2;

    public Exemplo(Object r1, Object r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    @Override
    public void run() {
        synchronized(r1){
            System.out.println(getName() + "Adquiri recurso 1");
            synchronized(r2){
                System.out.println(getName() + "Adquiri recurso 2");
            }
            System.out.println(getName() + "Liberei recurso 2");
        }
        System.out.println(getName() + "Liberei recurso 1");
        System.out.println("Fim da " + getName());
    }
    
    private String getName(){
        return Thread.currentThread().getName();
    }
}
