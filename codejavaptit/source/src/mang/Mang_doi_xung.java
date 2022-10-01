
package mang;

import java.util.Scanner;

public class Mang_doi_xung {
    public static int kiemtra(int s[],int n){
        for(int i = 0; i < n/2;i++){
            if(s[i] != s[n-i-1]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            int a = input.nextInt();
            int[] s = new int[101];
            for(int i = 0;i < a;i++){
                s[i] = input.nextInt();
            }
            if(kiemtra(s,a)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

