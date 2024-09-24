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

    public Empresa() {
        producao = 0;
        max_producao = 15;
    }
    
    public synchronized boolean trabalhar(int id){
        if (producao >= max_producao){
            return false;
        }
        producao++;
        System.out.println("ID: "+ id + " trabalho. " + "Produzido: " + producao);
        return true;
    }
    
    
}
