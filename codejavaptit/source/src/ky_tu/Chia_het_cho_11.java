/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Chia_het_cho_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- > 0){
            String a = input.next();
            BigInteger s = new BigInteger(a);
            BigInteger x = new BigInteger("11");
            BigInteger kq = s.divide(x);
            if(kq.multiply(x).compareTo(s) == 0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
