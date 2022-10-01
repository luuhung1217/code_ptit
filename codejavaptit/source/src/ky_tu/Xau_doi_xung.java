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
public class Xau_doi_xung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            String s = input.next();
            int dem = 0;
            for(int i = 0;i < s.length()/2;i++){
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    dem++;
                }
            }
            if(dem == 1|| dem == 0 && s.length() % 2 == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
