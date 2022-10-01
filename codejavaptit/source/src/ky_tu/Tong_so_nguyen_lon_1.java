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
public class Tong_so_nguyen_lon_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- > 0){
            String a = input.next();
            String b = input.next();
            BigInteger s = new BigInteger(a);
            BigInteger x = new BigInteger(b);
            BigInteger kq = s.add(x);
            System.out.println(kq);
        }
    }
}
