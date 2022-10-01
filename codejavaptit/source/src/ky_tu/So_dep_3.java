/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class So_dep_3 {
    public static boolean tn(String s){
        StringBuilder st = new StringBuilder(s);
        String b = st.reverse().toString();
        return s.equals(b);
    }
    public static boolean ngto(int n){
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean kt(String s){
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            int t = s.charAt(i)-'0';
            if(ngto(t) != true) return false; 
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            String s = input.next();
            if(tn(s) && kt(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
