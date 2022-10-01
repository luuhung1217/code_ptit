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
public class In_ma_tran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            int n = input.nextInt();
            int s[][] = new int[100][100];
            for(int i = 1 ;i <= n;i++){
                for(int j = 1 ;j <= n;j++){
                    s[i][j]=input.nextInt();
                }
            }
            for(int i = 1 ;i <= n;i++){
                for(int j = 1 ;j <= n;j++){
                    if(i % 2 != 0){
                        System.out.print(s[i][j]+" ");
                    }
                    else if(i % 2 == 0){
                        System.out.print(s[i][n-j+1]+ " ");
                    }
                }
               
            }
            System.out.print("\n");
        }
    }
}
