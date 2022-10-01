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
public class Tach_doi_va_tinh_tong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = s.length();
        while(n > -1){
            int m = s.length();
            BigInteger x = new BigInteger(s.substring(0,m/2));
            BigInteger y = new BigInteger(s.substring(m/2));
            s = x.add(y).toString();
            System.out.println(s);
        }
    }
}
