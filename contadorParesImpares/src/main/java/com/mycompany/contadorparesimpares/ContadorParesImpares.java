/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadorparesimpares;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class ContadorParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();
            }
            lista[i] = scanner.nextInt();
        }
        int[] contar = contador(lista);
        pares = contar[0];
        impares = contar[1];
        
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }

    public static int[] contador(int[] numeros) {
        int pares = 0;
        int impares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        return new int[] { pares, impares };
    }
}
