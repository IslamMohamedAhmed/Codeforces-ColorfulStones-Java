/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colorfulstones;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class ColorfulStones {

    public static void main(String[] args) {
        String s, t;
        char one, two;
        int indicator = 0, step = 1;

        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        t = scan.nextLine();
        for (int i = 0; i < t.length(); i++) {

            if (s.toCharArray()[indicator] == t.toCharArray()[i]) {
                step++;
                indicator++;
                
            } 
        }
        System.out.println(step);

    }
}
