/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co_ban;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Hinh_vuong {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max = 0;
        for(int  i = 0 ;i < 4;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            int tmp = abs(x-y);
            if(tmp >= max){
                max=tmp;
            }
        }
        System.out.println(max*max);
    }
}
