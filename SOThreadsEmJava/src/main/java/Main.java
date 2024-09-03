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
        int[] dados = new int[]{1,1,1,1,1,1,1,1,1,1};
        int resultados = 0;
        
        for (int i = 0; i < dados.length; i++) {
            resultados += dados[i];
            ProcessUtil.atrasar(1);
        }
        System.out.println(resultados);
    }
}
