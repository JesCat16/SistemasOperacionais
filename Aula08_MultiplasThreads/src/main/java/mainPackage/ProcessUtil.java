/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;

/**
 *
 * @author unifjjesus
 */
public class ProcessUtil {

  public static void atrasar(int tempo){
    int tempoAtraso = (int) (tempo * Math.random());
    try {
      Thread.sleep(tempoAtraso * 1000);
    } catch (InterruptedException e) {
    }
  }
}

