/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Hieu_so_nguyen_lon_1 {
    public static void hieuso(String s1,String s2){
        String kq=" ";
        while(s1.length() > s2.length()) s2 = "0" + s2;
        while(s1.length() < s2.length()) s1 = "0" + s1;
        if(s1.compareTo(s2) < -1){
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int nho = 0;
        for(int i = s1.length()-1;i >= 0;i-- ){
            int kt = (s1.charAt(i)+'0')-(s2.charAt(i) + '0') - nho;
            if(kt < 0){
                kq = (char)(kt+10+'0')+kq;
                nho = 1;
            }
            else{
                kq = (char)(kt+'0')+ kq;
                nho = 0;
            }
        }
        System.out.println(kq);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            String s1 = input.next();
            String s2 = input.next();
            hieuso(s1,s2);
        }
    }
}
