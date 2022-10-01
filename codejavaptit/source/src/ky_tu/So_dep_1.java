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
public class So_dep_1 {
    public static boolean tn(String s){
        StringBuilder st = new StringBuilder(s);
        String b = st.reverse().toString();
        return s.equals(b);
    }
    public static boolean chan(String s){
        for(int i = 0;i < s.length();i++){
            int t = s.charAt(i)-'0';
            if(t % 2 == 1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            String s = input.next();
            if(tn(s) && chan(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
