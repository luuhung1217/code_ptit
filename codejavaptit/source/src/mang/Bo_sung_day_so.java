
package mang;

import java.util.Scanner;

public class Bo_sung_day_so {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[1000],b[] = new int[1000];
        
        for(int i = 0 ; i <= 200; i++){
            b[i]=0;
        }
        for(int i = 1; i <= n;i++){
            a[i] = input.nextInt();
            b[a[i]] = 1;
        }
        int dem = 0 ;
        for(int i = 1 ;i <= a[n];i++){
            if(b[i] == 0){
                
                System.out.println(i);
                dem++;
            }
        }
        if(dem == 0){
            System.out.print("Excellent!");
        }
    }
}
