package Prova;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Questao02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Stack <String> pilha = new Stack();
        Stack <String> pilha2 = new Stack();
        Stack <String> pilha3 = new Stack();
        
        
  
        scanner = new Scanner(new File("D:\\Projetos\\ExemplosEstruturaDados\\ExemplosEstruturaDados-main\\ExemplosEstruturaDados-main\\pilha\\deputadosfederais1.txt"));
        while (scanner.hasNextLine()) {
            pilha.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha.size());    
       
       System.out.println("### Rotina a executar ###");
      
       Queue<String> q = new LinkedList<>();
       
         for (int i = 0; i < 20; i++){
             q.add(pilha.pop());             
         }  
         
         System.out.println(" --- Fileira 1 --- "); 
         q.forEach(System.out::println);
         
         
         
        scanner = new Scanner(new File("D:\\Projetos\\ExemplosEstruturaDados\\ExemplosEstruturaDados-main\\ExemplosEstruturaDados-main\\pilha\\deputadosfederais2.txt"));
        while (scanner.hasNextLine()) {
            pilha2.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha2.size());    
       
       System.out.println("### Rotina a executar ###");
      
       Queue<String> f = new LinkedList<>();
       
         for (int i = 0; i < 20; i++){
             f.add(pilha2.pop());             
         }  
         
         System.out.println(" --- Fileira 2 --- "); 
         f.forEach(System.out::println);
                
         
         
        scanner = new Scanner(new File("D:\\Projetos\\ExemplosEstruturaDados\\ExemplosEstruturaDados-main\\ExemplosEstruturaDados-main\\pilha\\deputadosfederais3.txt"));
        while (scanner.hasNextLine()) {
            pilha3.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha3.size());    
       
       System.out.println("### Rotina a executar ###");
      
       Queue<String> g = new LinkedList<>();
       
         for (int i = 0; i < 13; i++){
             g.add(pilha3.pop());             
         }  
         
         System.out.println(" --- Fileira 3 --- "); 
         g.forEach(System.out::println);
         

    }
 
 }
    


