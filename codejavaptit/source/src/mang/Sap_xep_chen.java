
package mang;
import java.util.Scanner;
public class Sap_xep_chen {
    public static void in(int s[] , int n){
        for(int i = 0 ;i < n;i++){
            System.out.print(s[i]+ " ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s[] = new int[105];
        for(int i = 0 ;i < n ;i++){
            s[i] = input.nextInt();
        }
        for(int i = 0; i< n;i++){
            int t = 0,j = 0;
            j = i-1;
            t = s[i];
            while(j >= 0 && t < s[j]){
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = t ;
            System.out.print("Buoc " +(i)+": ");
            in(s,i+1);
            System.out.print("\n");
        }
    } 
}
