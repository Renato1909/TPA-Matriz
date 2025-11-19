/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class Matrizes {

    public static void main(String[] args) {
        int [][]matrizNum = {
            {1,2,3,4},    
            {5,6,7,8}
            
    };
        for(int i = 0;i<matrizNum.length; i++) {
            for(int j = 0; j< matrizNum[i].length; j++)
        System.out.printf("| %d", matrizNum[i][j]);
}
        System.out.println("");
}
}
