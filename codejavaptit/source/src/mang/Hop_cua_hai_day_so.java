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
public class Hop_cua_hai_day_so {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a[] = new int[100], b[] = new int[100];
        boolean A[] = new boolean[1000], B[] = new boolean[1000];
        for(int i = 0; i < n;i++){
            a[i] = input.nextInt();
            A[a[i]]=true;
        }
        for(int i = 0; i < m ;i++){
            b[i] = input.nextInt();
            B[b[i]]=true;
        }
        for(int i = 0; i < 1000;i++){
            if(A[i] == true ||B[i] == true){
                System.out.print(i+" ");
            }
        }
    }
}
