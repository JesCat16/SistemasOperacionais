/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Soma implements Runnable{
    
    private int[] dados;
    public int inicio;
    public int fim;
    public int resultado;
    
    public Soma(int[] dados,int inicio, int fim){
        this.dados = dados;
        this.fim = fim;
        this.inicio = inicio;
        resultado = 0;
    }
    
    @Override
    public void run() {
        for (int i = inicio; i < fim; i++) {
            resultado += dados[i];
            ProcessUtil.atrasar(1);
        }
        System.out.println(resultado);
    }
}
