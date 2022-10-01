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
public class So_uu_the {
    public static boolean chan(String s){
        int demchan = 0,demle = 0;
        for(int i = 0;i < s.length();i++){
            int t =s.charAt(i)-'0';
            if(t % 2 == 0 ){ 
               demchan++;
            }
            else demle++;
        }
        if(demchan > demle && demchan % 2 == 0)
            return true;
        return false;
    }
    public static boolean le(String s){
        int demchan = 0,demle = 0;
        for(int i = 0;i < s.length();i++){
            int t =s.charAt(i)-'0';
            if(t % 2 == 0 ){
                demchan++;
            }
            else{
                demle++;
            }    
        }
        if(demchan < demle && demle % 2 == 1){
            return true;
        }
        return false;
    }
    public static boolean kt(String s){
        for(int i = 0;i < s.length();i++){
           if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int test = input.nextInt();    
       while(test -- > 0){
           String s = input.next();
           
           
           if(kt(s) != true){
               System.out.println("INVALID");
           }
           else{
               if(chan(s) == true||le(s) == true){
                   System.out.println("YES");
               }
               else System.out.println("NO");
           }
       }
    }
}
