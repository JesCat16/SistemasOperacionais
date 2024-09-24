/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

/**
 *
 * @author unifjjesus
 */
public class Main {
    public static void main(String[] args) {
        Empresa em = new Empresa();
        
        Trabalhadora[] trabalhadoras = new Trabalhadora[5];
        for(int i = 0; i < trabalhadoras.length; i++){
            trabalhadoras[i] = new Trabalhadora(i,em);
        }
        
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(trabalhadoras[i]);
            threads[i].start();
        }
    }
}
