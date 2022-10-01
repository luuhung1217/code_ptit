/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class Chuan_hoa_xau_ho_ten_2 {
    public static void chuanhoa(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        int number = st.countTokens();
        while(st.hasMoreTokens()){
            String tmp =st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            if(st.countTokens() == number-1){
                for(int i = 1;i < tmp.length();i++){
                    kq.append(Character.toUpperCase(tmp.charAt(i)));
                }
            }
            else{
                for(int i = 1;i < tmp.length();i++){
                    kq.append(Character.toLowerCase(tmp.charAt(i)));
                }
            }
            
            if(st.countTokens() > 0 ){
                kq.append(" ");
            }
        }
        
        int check = 0;
        for(int i= 0;i < kq.length();i++){
            if(kq.charAt(i)== ' '){
                check = i;
                break;
            }
        }
        for(int i=check+1;i < kq.length();i++){
            System.out.print(kq.charAt(i));
            if(i == kq.length()-1){
                System.out.print(",");
            }
        }
        System.out.print(" ");
        for(int i=0;i < check;i++){
            System.out.print(kq.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        while(n -- > 0){
           String s = input.nextLine();
           chuanhoa(s);
            System.out.print("\n");
        }
    }
}
