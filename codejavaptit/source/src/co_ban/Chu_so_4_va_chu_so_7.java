
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Chu_so_4_va_chu_so_7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long a = sc.nextLong();
       int dem = 0 ;
       while(a > 0){
           long b = a % 10;
           a /= 10;
           if(b == 4 || b==7){
               dem++;
           }
       }
       if(dem == 4 || dem == 7){
           System.out.print("YES");
       }
       else System.out.print("NO");
    }
}
