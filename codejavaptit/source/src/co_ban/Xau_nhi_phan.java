
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Xau_nhi_phan {
    public static void fibo(int n,long k){
        long[] f = new long[10000];
        f[1] = f[2] = 1;
        for(int i = 3; i <= 93 ;i++){
            f[i]=f[i-1]+f[i-2];
        }
        while(n > 2){
            if(k <= f[n-2]){ 
                n -= 2;
            }
            else{
                k -= f[n-2];
                n -= 1;
            }
        }
        if(n == 1 || n==2){ 
           System.out.println(Integer.toString(n-1));
        }    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            fibo(n,k);
        }
    }
    
}
