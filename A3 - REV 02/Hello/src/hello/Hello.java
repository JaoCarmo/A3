/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
      
     String nome;
     //String nome = "Mariana";
     int a, b;
     
     System.out.println("Digite seu nome: ");
     nome = sc.next();
     System.out.println("Hello " + nome);
     
     System.out.print("Digite um numero: ");
     a = sc.nextInt();
     
     System.out.print("Digite outro numero: ");
     b = sc.nextInt();
     
     System.out.println("Soma= " + (a+b));
     
     System.out.println("Subtracao= " + (a-b));
     
     System.out.println("Divisao= " + (a/b));
     
     System.out.println("Mutiplicacao= " + (a*b));
             
     //System.out.println("Hello " + nome + " amor da minha vida");

// TODO code application logic here
    }
    
}
