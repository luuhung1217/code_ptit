/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    public static long uscln(long a, long b){
        if(b == 0) return a;
        return uscln(b,a%b);
    }
    public static long boiso(long a,long b){
        return (a*b)/uscln(a,b);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            long tmp = 1;
            int n = input.nextInt();
            for(int i =1 ; i <= n ;i++){
                tmp = boiso(tmp,i);
            }
            System.out.println(tmp);
        }
                
    }
}
