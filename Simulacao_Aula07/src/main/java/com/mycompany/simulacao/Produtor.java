/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacao;

/**
 *
 * @author unifjjesus
 */
public class Produtor implements Runnable{
    
    private BufferCircular buffer;

    public Produtor(BufferCircular buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        int dado = 0;
        while(true){
            ProcessUtil.atrasar(2);
            buffer.inserir(dado);
        }
    }
    
}
