/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumacinconumeros;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Sumacinconumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        int total = 0;

        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingresa 5 numeros:");
            nums[i] = scanner.nextInt();
            total += nums[i];
        }

        System.out.println("la suma de los numeros es: " + total);
    }
}
