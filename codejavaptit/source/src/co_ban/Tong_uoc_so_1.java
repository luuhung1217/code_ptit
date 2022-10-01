
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Tong_uoc_so_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       int sum = 0;
       while(test --> 0){
           int a = sc.nextInt();
           while(a % 2 == 0){
               sum += 2;
               a /= 2;
           }
           for(int i = 3; i <= sqrt(a);i+=2){
               while(a % i == 0){
                   sum += i;
                   a /= i;
               }
           }
           if(a > 1 ) sum += a;
       }
       System.out.print(sum);
    }
    
}
