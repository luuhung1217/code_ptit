/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

/**
 *
 * @author HP
 */
public class diem_can_bang {
    public static long diemCanBang(long s[],int n){
        long sum1 = 0,sum = 0,sum2 = 0;
        for(int i = 0 ;i < n;i++){
            sum +=s[i];
        }
        for(int i = 0;i < n;i++){
            sum -= s[i];
            sum1 = sum;
            if(sum1 == sum2)
                return i+1;
            
            sum2+=s[i];
        }
        return -1;
    }
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            int n = input.nextInt();
            long s[] = new long[n+5];
            for(int i = 0 ;i < n;i++){
                s[i] = input.nextLong();
            }
            System.out.println(diemCanBang(s,n));
        }
        
    }
}
