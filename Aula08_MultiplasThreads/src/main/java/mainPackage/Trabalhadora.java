/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

/**
 *
 * @author unifjjesus
 */
public class Trabalhadora implements Runnable{

    private int id;
    private Empresa em;
    private boolean hasJob;

    public Trabalhadora(int id, Empresa em) {
        this.id = id;
        this.em = em;
        this.hasJob = true;
    }
    
    @Override
    public void run() {
        while(hasJob){
            ProcessUtil.atrasar(5);
            this.hasJob = em.trabalhar(this.id);
        }
    }
    
}
