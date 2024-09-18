/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacao;

/**
 *
 * @author unifjjesus
 */
public class Fabrica {
    public static void main(String[] args) {
        BufferCircular buffer = new BufferCircular();
        
        Thread produtora = new Thread(new Produtor(buffer));
        Thread consumidor = new Thread(new Consumidor(buffer));
        
        produtora.start();
        consumidor.start();
    }
}
