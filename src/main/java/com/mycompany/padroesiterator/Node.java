/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroesiterator;

/**
 *
 * @author eva
 */
public class Node<Pessoa> {
    
    private Node next;
    private Pessoa data;
    
    public Node(Node next, Pessoa data){
        this.next =  next;
        this.data =  data;
        
    }
    public Node(Pessoa data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Pessoa getData() {
        return data;
    }

    public void setData(Pessoa data) {
        this.data = data;
    }
    
    
}
