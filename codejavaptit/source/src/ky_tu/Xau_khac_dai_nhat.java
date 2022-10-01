/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Xau_khac_dai_nhat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            String s1 = input.next();
            String s2 = input.next();
            if(s1.equals(s2) == true){
                System.out.println("-1");
            }
            else{
                int max1 = max(s1.length(),s2.length());
                System.out.println(max1);
            }
        }
    }
}
