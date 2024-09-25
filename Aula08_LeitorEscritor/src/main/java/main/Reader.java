/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author unifjjesus
 */
public class Reader implements Runnable{
    Database db;
    int readerID;

    public Reader(int readerID, Database db) {
        this.db = db;
        this.readerID = readerID;
    }
    
    @Override
    public void run() {
        ProcessUtil.atrasar(5);
        db.read(readerID);
    }
    
}
