/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


/**
 *
 * @author HP
 */
public class Tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test -- > 0){
            Set<String> v = new HashSet<String>();           
            Set<String> kq = new HashSet<String>();
            String s = input.nextLine();
            String x = input.nextLine();
            StringTokenizer st1 = new StringTokenizer(s);
            
            while(st1.hasMoreTokens()){
                String tmp = st1.nextToken();
                v.add(tmp);
            }
            StringTokenizer st2 = new StringTokenizer(x);
            while(st2.hasMoreTokens()){
                String tmp = st2.nextToken();
                kq.add(tmp); 
            }
            for(String i:v){
                
                if(kq.contains(i)== false){
                    System.out.print(i+" ");
                }
            }
            System.out.println("");
        }
    } 
}
