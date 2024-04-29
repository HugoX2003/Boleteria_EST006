/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labestboleteria006;

import java.util.EmptyStackException;

public class LinkedQueue<T> implements QueueADT<T> {
    private LinearNode<T> front;
    private LinearNode<T> rear;
    private int c;

    public LinkedQueue(){
        c = 0;
        front = rear = null;
        }
    
    public void enqueue (T element){
       LinearNode<T> node = new LinearNode<T>(element);
        if (isEmpty( ))
            front = node;
        else
            rear.setNext (node);
            
        rear = node;
        c++;
    }
     
    public T dequeue ( ) {
        
        T result = front.getElement( );
        front = front.getNext( ); 
        c--;    
         if (isEmpty( ))   
            rear = null;
         
         return result;
}   

    public T first() {
    
    return front.getElement();
  }


    public boolean isEmpty(){
        return (c==0);
        }


    public int size(){
        return c;
        }
    
    @Override
    public String toString()
  {
    String r = "";
    LinearNode<T> current = front;

    while (current != null)
    {
      r = "\n"+r + (current.getElement()).toString() + "\n";
      current = current.getNext();
    }

    return r;
  }
}
