/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes2;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class Matrizes2 {

    public static void main(String[] args) {
        int [] [] myMatriz = {
            {0,1,2},
            {3,4,5},
                {6,7,8}
    };
        for(int i = 0; i< myMatriz.length; i++) {
            for(int j = 0; j< myMatriz [i].length;j++) {
                System.out.printf("| %d ", myMatriz[i][j]);
}
                System.out.println("");
}
    }
}
