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
public class Danh_sach_ke {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s[][] = new int[n+5][n+5];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                s[i][j] = input.nextInt();
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print("List(" + (i+1) +") = ");
            for(int j = 0;j < n;j++){
                if(s[i][j] == 1){
                    System.out.print((j+1) +" ");
                }
            }
            System.out.print("\n");
        }
    }
}
