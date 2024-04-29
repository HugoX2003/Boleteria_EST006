/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package labestboleteria006;

public interface QueueADT<T> {
    public void enqueue (T element);
    public T dequeue( );
    public T first( ); 
    public boolean isEmpty( );
    public int size( );
    public String toString( );
}
