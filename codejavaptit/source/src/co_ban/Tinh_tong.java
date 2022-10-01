
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Tinh_tong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean check=true;
        while(check){
            long a = sc.nextInt();
            long sum = (long)(a*(a+1))/2;
            System.out.println(sum);
            t--;
            if(t==0) check = false;
        }
    }
}
