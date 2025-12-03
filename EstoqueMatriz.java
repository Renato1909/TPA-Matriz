/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estoquematriz;
import java.util.Scanner;
/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class EstoqueMatriz {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[][] estoque = new String[1][4];
        
        System.out.println("=== SISTEMA DE ESTOQUE ===");
        System.out.print("Digite o produto:\n");
            
            System.out.print("Nome do produto: ");
            estoque[0][0] = scanner.nextLine();
            
            System.out.print("Quantidade: ");
            estoque[0][1] = scanner.nextLine();
            
            System.out.print("Preço por unidade (sem descontos): ");
            estoque[0][2] = scanner.nextLine();
        
            try {
                
                int quantidade = Integer.parseInt(estoque[0][1]);
                double preco = Double.parseDouble(estoque[0][2]);
                double valorTotal = quantidade * preco;
                
                //O string.format define a quantidade de casas decimais no valor final, que neste caso são 2.
                estoque[0][3] = String.format("%.2f", valorTotal);
                
            //Usei try e catch para pegar valores inválidos, com o NumberFormatException sendo um erro mais específico, em que a conversão de valores é inválida.
            } catch (NumberFormatException e) {
                System.out.println("Erro, Digite valores numéricos para quantidade e preço!");
                estoque[0][3] = "0.00";
            }
           
            System.out.println();
        
        System.out.println("\n==================== TABELA DE ESTOQUE ====================");

        System.out.printf("%-20s %-10s %-9s %-12s\n", "| Produto |", "|Quantidade| ", " |Preço| ", " |Valor Total|");

        for (int i = 0; i < 1; i++) {
            System.out.printf("%-20s %-14s %-9s R$ %-12s\n", estoque[i][0], estoque[i][1], "R$ " + estoque[i][2], estoque[i][3]);
        }
        
        scanner.close();
        
    }
} 
