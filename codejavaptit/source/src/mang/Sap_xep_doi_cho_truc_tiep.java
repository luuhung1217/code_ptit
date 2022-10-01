
package mang;
import java.util.Scanner;
public class Sap_xep_doi_cho_truc_tiep {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s[] = new int[100];
        for(int i = 0 ;i < n ;i++){
            s[i] = input.nextInt();
        }
        for(int i = 0 ; i < n-1;i++ ){
            System.out.print("Buoc "+ (i+1)+": ");
            for(int j = i+1 ;j < n;j++){
                if(s[i] > s[j]){
                    int tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
                
            }
            for(int j = 0; j < n;j++){
                System.out.print(s[j]+" ");
            }
            System.out.println("\n");
        }
    }
}