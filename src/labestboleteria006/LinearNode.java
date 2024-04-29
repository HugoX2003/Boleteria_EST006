/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labestboleteria006;

public class LinearNode <E> {
    private LinearNode<E> next;   
    private E element;           

    public LinearNode() {        
        this.next = null;
        this.element = null;
    }
    
    public LinearNode(E elem)     
    {
        this.next = null;
        this.element = elem;
    }


    
    public LinearNode<E> getNext() {  
        return this.next;
    }

    public void setNext(LinearNode<E> node) {
        this.next = node;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E elem) {
        this.element = elem;
    }
}
