/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ky_tu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class Dia_chi_email {
    public static String chuanhoa(String s){
        s = s.toLowerCase();
        StringTokenizer st = new StringTokenizer(s);
        String username="";
        String h = new String();
        
        while(st.hasMoreTokens()){
            String tmp1 = st.nextToken();
            if(st.countTokens() > 0){
                h += tmp1.charAt(0);
            }
            if(st.countTokens() == 0){
                username +=tmp1;
            }
        }username += h;
        return username;
    }
    public static int dem(ArrayList list,String username){
        int dem = 0;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).equals(username)){
                dem++;
            }
        }
        return dem;
    } 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        int t = 0;
        ArrayList<String> list = new ArrayList<>();
        while(test -- > 0){
            String s = input.nextLine();
            String username = chuanhoa(s);
            
            int count = dem(list,username);
            if(count == 0){
                System.out.println(username+"@ptit.edu.vn");
            }
            else{
                System.out.println(username+ (count+1) +"@ptit.edu.vn");
            }
            list.add(username);
        }
    }
    
}
