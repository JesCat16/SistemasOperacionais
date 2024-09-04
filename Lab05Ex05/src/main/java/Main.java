/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] dados = new int[][]{{1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1}};
        int resultados = 0;
        int resultados2 = 0;
        
        Soma s1 = new Soma(dados[0],0,5);
        Thread t1 = new Thread(s1);
        
        Soma s2 = new Soma(dados[0],5,10);
        Thread t2 = new Thread(s2);
        
        Soma s3 = new Soma(dados[1],0,5);
        Thread t3 = new Thread(s3);
        
        Soma s4 = new Soma(dados[1],5,10);
        Thread t4 = new Thread(s4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        resultados = s1.resultado + s2.resultado;
        resultados2 = s3.resultado + s4.resultado;
        
        System.out.println("Soma[0]: " + resultados);
        System.out.println("Soma[1]: " + resultados2);
        
    }
}
