package mang;

public class Sap_xep_noi_bat {
    public static void in(int s[] , int n){
        for(int i = 0 ;i < n;i++){
            System.out.print(s[i]+ " ");
        }
    }
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int s[] = new int[105];
        for(int i = 0 ;i < n ;i++){
            s[i] = input.nextInt();
        }
        for(int i = 0; i< n;i++){
            int tmp = 0,check = 0;
            for(int j = 0;j < n-1;j++){
                if(s[j] > s[j+1]){
                    tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                    check=1;
                }
            }
            if(check == 0) break;
            System.out.print("Buoc " +(i+1)+": ");
            in(s,n);
            System.out.print("\n");
        }
    } 
}
