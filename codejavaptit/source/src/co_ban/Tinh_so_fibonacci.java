
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Tinh_so_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            long b = sc.nextLong();
            System.out.println(Sofibonacci(b));
        }
    }
    public static long Sofibonacci(long n){
        long fn=0,f1=0,f2=1;
        if(n == 1 || n==2){
            return 1;
        }
        for(int i=1 ; i < n;i++){
            fn=f1+f2;
            f1=f2;
            f2=fn;
        }
        return fn;
    }
}
