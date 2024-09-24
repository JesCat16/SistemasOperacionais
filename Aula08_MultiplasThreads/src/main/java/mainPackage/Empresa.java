/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

/**
 *
 * @author unifjjesus
 */
public class Empresa {
    private int producao;
    private int max_producao;
    private int turno;
    private int max_threads;

    public Empresa() {
        producao = 0;
        max_producao = 15;
        turno = 1;
        max_threads = 5;
    }
    
    public synchronized boolean trabalhar(int id){
        while(turno != id){
            try{
                wait();
            }catch(InterruptedException e){
                
            }
        }
        if (producao >= max_producao){
            turno = (turno+1)%max_threads;
            notifyAll();
            return false;
        }
        turno = (turno+1)%max_threads;
        notifyAll();
        producao++;
        System.out.println("ID: "+ id + " trabalho. " + "Produzido: " + producao);
        return true;
    }
    
    
}
