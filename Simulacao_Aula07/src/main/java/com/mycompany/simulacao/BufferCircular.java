/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacao;

/**
 *
 * @author unifjjesus
 */
public class BufferCircular {
    private static final int BUFFER_SIZE = 5;
    private int[] buffer;
    private int in, out;
    private int contador;

    public BufferCircular() {
        buffer = new int[BUFFER_SIZE];
        in = 0;
        out = 0;
        contador = 0;
    }
    
    public void inserir(int item){
        int tempoEspera = 0;
        while(contador == BUFFER_SIZE){
            System.out.println(tempoEspera++ + " ***\r");;
        }
        buffer[in] = item;
        in = (in + 1) % BUFFER_SIZE;
        contador++;
        System.out.println("\nProdutor: Contador: " + contador);
    }
    
    public int remove(){
        int tempoEspera = 0;
        while(contador == 0){
            System.out.println(tempoEspera++ + "###\r");
        }
        int item = buffer[out];
        out = (out + 1) % BUFFER_SIZE;
        contador--;
        System.out.println("\nConsumidor: Contador: " + contador);
        return item;
    }
    
    
}
