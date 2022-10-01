/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class Cat_doi {
 
    public static boolean kiemtra(long s[],int n){
        long dem = 0,dem1 = 0;
        for(int i = 0 ;i < n ;i++){
            if(s[i]== 0 || s[i] == 1 || s[i] == 8 || s[i] == 9){
                dem++;
            }
            if(s[i]== 0|| s[i] == 8 || s[i] == 9){
                dem1++;
            }
        }
        if(dem < n || dem1 == n){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 1 ; i <= test ;i++){
            long a =sc.nextLong();
            long[] s = new long[20];
            int dem = 0;
            while(a > 0){
                s[dem++] = (a % 10);
                a /= 10;
            }
            String kq="";
            for(int j = dem-1 ;j >= 0 ;j--){
                if(true != kiemtra(s,dem)) {
                    kq = "INVALID";
                }
                else{
                    if(s[j] == 0 || s[j] == 8 || s[j] == 9){
                        kq += "0";
                    }
                    else if(s[j] == 1){                      
                        kq +="1";
                    }                 
                }
            }
            System.out.println(Long.parseLong(kq));
        }
    }
}