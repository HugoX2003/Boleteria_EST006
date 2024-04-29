/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labestboleteria006;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class Boleteria{

    public static final int NUM_CLIENTES = 100;
    public static final int MAX_BOLETERIAS = 15;
    public static final int TIEMPO_PROCESAMIENTO = 120;
    
    public static void main(String[] args) {

        Cliente cliente;
        LinkedQueue<Cliente> ClienteCola = new LinkedQueue<Cliente>();
        int[] TimBoleteria = new int[MAX_BOLETERIAS];
        int parte;
        int TiempoPromedio;
        int TiempoTotal;


       for (int boleteria = 0; boleteria < MAX_BOLETERIAS; boleteria++) {
            for (int i = 0; i < boleteria; i++)
                TimBoleteria[i] = 0;

            for (int i = 1; i <= NUM_CLIENTES; i++)
                ClienteCola.enqueue(new Cliente(i * 15));

            TiempoTotal = 0;

            while (!(ClienteCola.isEmpty())) {
                for (int i = 0; i <= boleteria; i++) {
                    if (!(ClienteCola.isEmpty())) {
                        cliente = ClienteCola.dequeue();
                        if (cliente.getTiempoArribo() > TimBoleteria[i])
                            parte = cliente.getTiempoArribo()+ TIEMPO_PROCESAMIENTO;
                        else
                            parte = TimBoleteria[i] + TIEMPO_PROCESAMIENTO;
                        cliente.setTiempoPartida(parte);
                        TimBoleteria[i] = parte;
                        TiempoTotal += cliente.getTiempoTotal();
                    }
                    
                }
            }

            TiempoPromedio = TiempoTotal / NUM_CLIENTES;
            System.out.println("Numero de boleterias: " + (boleteria + 1));
            System.out.println("Tiempo Promedio: " + TiempoPromedio + " seg\n");
        }
    }
    
}
