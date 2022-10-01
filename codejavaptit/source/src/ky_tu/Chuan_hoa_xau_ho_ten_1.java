/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chuan_hoa_xau_ho_ten_1 {
    public static String chuanhoa(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i =1 ;i < tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            String s = input.nextLine();
            System.out.println(chuanhoa(s));
        }
    }
}

