/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author unifjjesus
 */
public class Database {

    int nrReaders;
    boolean isWriting;
    private Object trava;

    public Database() {
        nrReaders = 0;
        isWriting = false;
        this.trava = new Object();
    }

    public void read(int id) {
        synchronized (trava) {
            while (isWriting) {
                bloqueio();
            }
            nrReaders++;
        }
        System.out.println("R: " + id + " is reading. QTDE:" + nrReaders);
        ProcessUtil.atrasar(5);
        System.out.println("R: " + id + " finished reading. QTDE:" + nrReaders);
        synchronized (trava) {
            nrReaders--;
            if (nrReaders == 0) {
                trava.notify();
            }
        }
    }

    public void write(int id) {
        synchronized (trava) {
            while (nrReaders > 0 || isWriting) {
                bloqueio();
            }
            isWriting = true;
            System.out.println("W: " + id + " is writing.");
            ProcessUtil.atrasar(5);
            System.out.println("W: " + id + " finished writing.");
            isWriting = false;
            trava.notifyAll();
        }
    }

    private void bloqueio() {
        try {
            trava.wait();
        } catch (InterruptedException e) {
        }
    }
}
