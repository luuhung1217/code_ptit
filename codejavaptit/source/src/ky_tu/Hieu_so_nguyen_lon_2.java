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
public class Hieu_so_nguyen_lon_2 {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        BigInteger s = new BigInteger(a);
        BigInteger x = new BigInteger(b);
        BigInteger kq = s.subtract(x);
        BigInteger kt = new BigInteger("-0");
        if(kq.compareTo(kt) == 0){
            System.out.println("0");
        } 
        else{
            System.out.println(kq);
       }
        
    } 
}
