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

public class So_xa_cach {
    public static boolean kt(int s[],int n){
        for(int i = 1;i <= n-1;i++){
            if(s[i] + 1 == s[i+1]||s[i] == s[i+1]+1){
                return false;
            }
        }
        return true;
    }
    public static void hoanvi(int s[], int n){
        for(int i = 1; i <= n;i++){
            s[i] = i;
        }
        while(true){
            if(kt(s,n)){
                for(int i = 1;i <= n;i++){
                    System.out.print(s[i]);
                }
                System.out.print("\n");
            }
            int i = n-1;
            while(i > 0 && s[i] > s[i+1]){
                i--;
            }
            if(i == 0){
                return;
            }
            int k = n;
            while(s[k] < s[i]) k--;
            int tmp = s[i];
            s[i] = s[k];
            s[k] =tmp;
            int l = i+1, r = n;
            while(l < r){
                int tmp1 = s[l];
                s[l] = s[r];
                s[r] = tmp1;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            int n = input.nextInt();
            int s[] = new int[105];
            hoanvi(s,n);
            System.out.print("\n");
        }
        
    }
}

   
