/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirnumeros;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Invertirnumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] nums = new int [6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("ingresa 6 numeros:");
            nums[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < nums.length / 2; i++) {
            int gr = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = gr;
        }

        System.out.println("los numeros invertidos son:");
        for (int i = 0; i < 8; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
