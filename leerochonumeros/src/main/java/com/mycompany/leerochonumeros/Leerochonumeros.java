/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leerochonumeros;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Leerochonumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[8];
        int may = nums[0];

        for (int i = 0; i < 8; i++) {
            System.out.println("ingresa 8 numeros:");
            nums[i] = scanner.nextInt();
        }
        int men=nums[0];
        
        for (int i = 1; i<8; i++) {
            if (nums[i]>may) {
                may=nums[i];
            }
            if (nums[i]<men) {
                men=nums[i];
            }
        }
        System.out.println("Numero mayor : " + may + " Numero menor : " + men);
    }
}
