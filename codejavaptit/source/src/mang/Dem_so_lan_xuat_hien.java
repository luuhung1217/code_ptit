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
public class Dem_so_lan_xuat_hien {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for(int j = 1 ;j <= test ;j++){
            int n = input.nextInt();
            int s[] = new int[100000];
            int A[] = new int[100000], B[] = new int[100000];
            System.out.println("Test "+ j +":");
            for(int i = 0 ; i < n ;i++){
                s[i] = input.nextInt();
                A[s[i]]++;
            }
            for(int i = 0 ;i < n;i++){
                B[s[i]]++;
                if(B[s[i]] == 1){
                    System.out.println(s[i] + " xuat hien " + A[s[i]]+" lan");
                }
            }
        }
    }
}
