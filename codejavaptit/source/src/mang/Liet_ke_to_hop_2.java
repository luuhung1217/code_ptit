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
public class Liet_ke_to_hop_2 {
    public static void lk(int n,int k){
        int[] tohop = new int[100];
        int dem = 0;
        for(int i = 1; i<= k;i++){
            tohop[i]=i;
        }
        boolean check=true;
        while(check){
            dem++;
            for(int i=1;i <= k;i++){
                System.out.print(tohop[i]);
                
            }
            System.out.print(" ");
            int i = k;
            while(i > 0 &&tohop[i] >= n-k+i) i--;
            if(i > 0){
                tohop[i] += 1;
                for(int j=i+1;j<=k;j++){
                    tohop[j] = tohop[i] + j - i;
                }
            }
            else check=false;
        }
        System.out.print("\n");
        System.out.println("Tong cong co " + dem + " to hop");
    } 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        lk(n,k);
    }
}
