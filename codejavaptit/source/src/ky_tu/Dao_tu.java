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
public class Dao_tu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            StringTokenizer s = new StringTokenizer(input.nextLine()); 
            String kq="";
            while(s.hasMoreTokens()){
                String tmp = s.nextToken();
                for(int i = tmp.length()-1;i >= 0 ;i--){
                    kq += tmp.charAt(i);
                }
                kq+=" ";
            }
            
            System.out.println(kq);
        }
    }
}
