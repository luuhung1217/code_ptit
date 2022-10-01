/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sap_xep_chon {
    public static void xuat(int s[] ,int n){
        for(int i = 0; i < n;i++){
            System.out.print(s[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s[] = new int[105];
        for(int i =0 ;i < n;i++){
            s[i] = input.nextInt();
        }
        int t = 0, tmp = 0;
        for(int i = 0 ;i < n-1 ;i++){
           t = i;
           for(int j = i+1 ; j < n ;j++)
               if(s[t] > s[j])
                   t = j;
                   tmp = s[t];
                   s[t] = s[i];
                   s[i] = tmp;
              
            System.out.print("Buoc " + (i+1) +": ");
            xuat(s,n);
            System.out.print("\n");
            }
    }
}
