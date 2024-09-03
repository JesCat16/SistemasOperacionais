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
    public int resultado;
    
    public Soma(int[] dados){
        this.dados = dados;
        resultado = 0;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < dados.length; i++) {
            resultado += dados[i];
            ProcessUtil.atrasar(1);
        }
        System.out.println(resultado);
    }
    
}
