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
public class So_dep_2 {
    public static boolean daucuoi(String s){
        if(s.charAt(0) == '8' && s.charAt(s.length()-1) == '8'){
            return true;
        }
        return false;
    }
    public static boolean chiahet(String s){
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            int t = s.charAt(i)-'0';
            sum += t;
        }
        if(sum % 10 != 0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            String s = input.next();
            if(daucuoi(s) && chiahet(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
