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
public class Bien_so_dep {
    public static boolean tangdan(String s){
        for(int i = 5;i < s.length()-1;i++){
            if(s.charAt(i) >= s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static boolean kt(String s){
        for(int i = 5;i < s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static boolean kt1(String s){
        int dem=0;
        for(int i = 5;i < s.length();i++){
            int t = s.charAt(i)-'0';
            if(t==6||t==8){
                dem++;
            }
            
        }
        if(dem == s.length()-5){
            return true;
        }
        return false;
    }
    public static boolean kt2(String s){
        if(s.charAt(5)==s.charAt(6)&&s.charAt(6)==s.charAt(7)&&s.charAt(8)==s.charAt(9)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            String s = input.next();
            s = s.replaceAll("\\.", "");
            if(tangdan(s) == true|| kt(s)==true||kt1(s)==true||kt2(s)==true){
                
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
