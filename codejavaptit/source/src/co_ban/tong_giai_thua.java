
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= a ;i++){
            sum += tinhgiaithua(i);
        }
        System.out.println(sum);
    }
    
    public static long tinhgiaithua(int n){
        long giaithua = 1;
        for(int i = 1; i<= n ;i++){
            giaithua = giaithua*i;
        }
        return giaithua;
    }
}
