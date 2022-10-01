/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Rut_gon_xau_ky_tu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        ArrayList<Character> vecto = new ArrayList<>();
        for(int i = 0 ;i < s.length();i++){
            vecto.add(s.charAt(i));
        }
        boolean check = true;
        while(check){
            check = false;
            for(int i = 0;i < vecto.size()-1;i++){
                if(vecto.get(i) == vecto.get(i+1)){
                    vecto.remove(i);
                    vecto.remove(i);
                    check = true;
                }
            }
        }
        if(vecto.size() > 0){
            for(int i = 0;i < vecto.size();i++){
                System.out.print(vecto.get(i));
            }
        }
        else{
            System.out.print("Empty String");
        }
    }
}
