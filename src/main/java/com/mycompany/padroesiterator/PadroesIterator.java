/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.padroesiterator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author eva
 */
public class PadroesIterator {

    public static void main(String[] args) throws IOException {
        
        ListaEncadeada<Pessoa> newlist = new ListaEncadeada<>();
        ArrayList<Pessoa> people = new ArrayList<>();
        FileWriter arq = new FileWriter("/home/evafrancesca/NetBeansProjects/PadroesIterator/listaPessoas.txt");
        PrintWriter gravarArq =  new PrintWriter(arq);
        
        System.out.println(newlist.iterator());
        
        Pessoa p1 = new Pessoa("Luiz",'M',3);
        Pessoa p2 = new Pessoa("Maria",'F',2);
        Pessoa p3 = new Pessoa("José",'M',1);
        Pessoa p4 = new Pessoa("Thais",'F',4);
        Pessoa p5 = new Pessoa("Antônio",'M',6);
        Pessoa p6 = new Pessoa("Larissa",'F',7);
        Pessoa p7 = new Pessoa ("Bernardo",'M',8);
        
        newlist.add(p1);
        newlist.add(p2);
        newlist.add(p3);
        newlist.add(p4);
        newlist.add(p5);
        newlist.add(p6);
        
        for(Pessoa pessoa : newlist){
            gravarArq.print(pessoa.toString());
        }
        arq.close();
        
        // myList.remove(p5);
        System.out.println(newlist.getSize());
        
        //  imprime todos objetos da lista 
         
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        
        Collections.sort(people);
        System.out.println("---ordena de acordo com id da pessoa ---");
        for(Pessoa p : people){
            System.out.println(p);
        }
        // chamanda dos métodos hasnext()e next();
        Iterator it = newlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + "teste iterator");
        }
        
        Iterator< Pessoa> iterator = newlist.iterator();
         iterator.forEachRemaining(pessoa->{
             System.out.println(pessoa.toString() + "foreach");
         });
          
        
        //O for each vai percorrer cada elemento da lista e imprimir    
    
        newlist.varrerList(newlist);
        
        
     //QUESTÃO 7 E 8 chegar e remover objetos da lista
     
        newlist.checarPessoaExistente(p7, newlist);
        System.out.println(newlist.getSize());
        newlist.removerPessoaExistente(p7, newlist);
        System.out.println(newlist.getSize());
        
        //compara o id dos objetos da lista 
        System.out.println(p5.compareTo(p6));
        System.out.println(p2.compare(p2, p3));
        
       
        
        
        
        
         }
        
     
       
        
        
        
        
        
        
        
        
        
    }
