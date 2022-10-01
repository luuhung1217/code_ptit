/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Thu_gon_day_so {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> vecto = new ArrayList<>();
        for(int i = 0 ;i < n;i++){
            vecto.add(input.nextInt());
        }
        boolean check=true;
        while(check){
            check = false;
            for(int i = 0 ;i < vecto.size()-1;i++){
                if((vecto.get(i)+vecto.get(i+1)) % 2 == 0){
                    vecto.remove(i);
                    vecto.remove(i);
                    check = true;
                }
            }
            
        }
        System.out.print(vecto.size());
    }
}
