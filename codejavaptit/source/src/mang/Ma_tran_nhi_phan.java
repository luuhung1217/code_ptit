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
public class Ma_tran_nhi_phan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s[][] = new int[1000][3];
        for(int i = 0 ;i < n ;i++){
            for(int j = 0;j < 3;j++){
                s[i][j] = input.nextInt();
            }
        }
        int dem = 0;
        for(int i = 0; i < n;i++){
            int dem1 = 0,dem2 = 0;
            for(int j = 0;j < 3;j++){
                if(s[i][j] == 1){
                    dem1++;
                }
                else{
                    dem2++;
                }
            }
            if(dem1 > dem2){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
