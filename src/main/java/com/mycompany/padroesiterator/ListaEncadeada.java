/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroesiterator;


import java.util.Iterator;


/**
 *
 * @author eva
 *
 */
public class ListaEncadeada<Pessoa> implements Iterable<Pessoa> {
    private Node root;
    private int size;
    
    //construtor 
    public ListaEncadeada(Node root,int size){
        this.root = root;
        this.size = size;
        
        
        }
    
    //construtor vázio
    public ListaEncadeada(){}
            
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
   public void add(Pessoa pessoa){
       Node novoNode = new Node(pessoa);
       novoNode.setData(pessoa);
       if(this.root== null){
           this.root= novoNode;
           
       }else{
            Node local =root;     
            while(local.getNext()!=null){
                local = local.getNext();
            }
            local.setNext(novoNode);
            novoNode.setNext(null);
                   
                   
        }
        this.size++;
       }
       
   
   public void remove(Pessoa pessoa){
         
      Node previous = null;
      Node actual =  this.root;
      for(int i= 0;i< this.getSize();i++){
          if(actual.getData().equals(pessoa)){
              if(actual == root){
                  root = null;
          }else if(actual == root){
            this.root = actual.getNext();
             actual.setNext(null);
          }else{
            previous.setNext(actual.getNext());
            actual = null;
          }
                  
            this.size--;
            break;
          }
          previous = actual;
          actual = actual.getNext();
      
      
     
     }
      
       }
    //  varre e imprimi os elementos da lista 
   
   public void varrerList(ListaEncadeada<Pessoa> list){
       
       Iterator<Pessoa> iterator = list.iterator();
       iterator.forEachRemaining(pessoa-> {
       System.out.println(pessoa.toString() );
   });
       
   }
   
   public void checarPessoaExistente(Pessoa pessoaA, ListaEncadeada<Pessoa> list){
       boolean estaNaLista = false;
       for(Pessoa pessoaB : list){
           if(pessoaB.equals(pessoaA)){
               System.out.println("Essa pessoa já está na lista!");
               estaNaLista = true;
               break;
           }
       }
       if(!estaNaLista){
           
           System.out.println("Essa pessoa não está lista");
       }
       
       
       
   }
   
   public void removerPessoaExistente(Pessoa pessoaA, ListaEncadeada<Pessoa> list){
       
       boolean estaNaLista = false;
       for(Pessoa pessoaB : list){
           if(pessoaB.equals(pessoaA)){
               list.remove(pessoaA);
               System.out.println("pessoa removida com sucesso!");
               estaNaLista = true;
               break;
               
           }
       }
       
       if(!estaNaLista){
           System.out.println("Não foi possível remover essa pessoa pois ela não  está na lista!");
       }
   
    
}
   
      
    
      
     
      @Override
      public Iterator<Pessoa> iterator(){
          return new ListIterator<Pessoa>(this);
   }
     
    }
   
   
   
       
   
   class ListIterator<Pessoa> implements Iterator<Pessoa>{
          Node<Pessoa> current;
          
        public ListIterator(ListaEncadeada<Pessoa>list){
            current = list.getRoot();
           
            
      }
        public boolean hasNext(){
            return current != null;
              
          }
        public Pessoa next(){
            Pessoa data = current.getData();
            current = current.getNext();
            return data;
        }
        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
      }
   
   
   

    


   
    
    
    

