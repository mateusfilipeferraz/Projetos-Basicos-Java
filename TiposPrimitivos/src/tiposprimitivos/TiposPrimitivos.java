/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mateus Ferraz
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite uma nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome,+ nota);
    }
    
}
