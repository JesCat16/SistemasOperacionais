/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class ProcessUtil {
    public static void atrasa(int tempo) {
        try{
            Thread.sleep(tempo * 1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
