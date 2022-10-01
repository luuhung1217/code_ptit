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
public class Danh_dau_chu_cai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int danhdau[] = new int[100];
        for(int i = 0 ;i< s.length();i++){
            int tmp = s.charAt(i)-'0';
            danhdau[tmp] = 1;
        }
        int dem = 0;
        for(int i = 0; i < s.length();i++){
            int tmp = s.charAt(i)-'0';
            if(danhdau[tmp] == 1){
                dem++;
                danhdau[tmp] = 0;
            }
        }
        System.out.println(dem);
    }
}
