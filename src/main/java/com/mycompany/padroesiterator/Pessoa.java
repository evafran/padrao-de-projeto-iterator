/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroesiterator;

/**
 *
 * @author eva
 */
public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private char sexo;
    private int Id;
    
    public Pessoa(String nome, char sexo, int Id){
        this.nome = nome;
        this.sexo = sexo;
        this.Id = Id;
                
    }
    
    public Pessoa(){
        
        this.Id = Id + 1;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    @Override
    public String toString() {
        
        return String.format("nome: %s   \n Id: %d   \n sexo: %c  \n",nome,Id,sexo);
    }

    @Override
    public int compareTo(Pessoa novaPessoa ) {
        if(this.Id<novaPessoa .Id){
            return -1;
        }
        else if(this.Id>novaPessoa.Id){
            return 1;
        }
        else{
            return 0;
        }
        
    }
            

    public int compare(Pessoa a,Pessoa b){
        return a.compareTo(b);
    }
   
            

    
}
