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
public class Tich_ma_tran_chuyen_vi_cua_no {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for(int k = 0;k < test;k++){
            int n = input.nextInt();
            int m = input.nextInt();
            int s[][] = new int[n+5][m+5],a[][] = new int[m+5][n+5];
            int b[][] = new int[n+5][n+5]; 
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++){
                    s[i][j] = input.nextInt();
                    a[j][i] = s[i][j];
                }
            }
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    for(int t = 0;t < m;t++){
                        b[i][j] += s[i][t] * a[t][j];
                    }
                }
            }
            System.out.println("Test "+ (k+1) +":");
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
