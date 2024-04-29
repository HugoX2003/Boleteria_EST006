/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labestboleteria006;

public class Cliente {
    public int tiempoArribo;
    public int tiempoPartida;

    public Cliente(int tArribo) {
        tiempoArribo = tArribo;
        tiempoPartida =  0 ;
    }

    public int getTiempoArribo() {
        return tiempoArribo;
    }

    public int getTiempoPartida() {
        return tiempoPartida;
    }

    public void setTiempoPartida(int tPartida) {
        tiempoPartida = tPartida;
    }
    
   public int getTiempoTotal(){
       return (tiempoPartida - tiempoArribo);
   } 
}
