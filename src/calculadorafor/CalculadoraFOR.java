/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorafor;

import java.util.Scanner;

public class CalculadoraFOR {

   
    public static void main(String[] args) {
   //Declarando variaveis e teclado
       
    Scanner Teclado = new Scanner(System.in);
    int num;
    int i;
    
   // Entrada de Dados
        
        System.out.println("Entre com o numero da tabuada" );
        num = Teclado.nextInt();
        System.out.println("Mostra a tabuada de 1 a 10 do número" +num);
   // Processamento de Dados
        for ( i=1; i<=10; i++) {
            
            System.out.println("Tabuada["+num+"] * "+i+" = " + (i*num));
        }
    }
    
}
