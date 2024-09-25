/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author unifjjesus
 */
public class Writer implements Runnable{
    Database db;
    int writerID;

    public Writer(int writerID, Database db) {
        this.db = db;
        this.writerID = writerID;
    }
    
    @Override
    public void run() {
        ProcessUtil.atrasar(5);
        db.write(writerID);
    }
    
}
