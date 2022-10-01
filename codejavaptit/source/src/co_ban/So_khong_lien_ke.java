package co_ban;
import java.util.Scanner;

public class So_khong_lien_ke {
    public static int kiemtra(long s[],int n){
        for(int i = 0;i < n-1;i++){
            if(s[i] + 2 == s[i+1] || s[i] == s[i+1] + 2){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test -- > 0){
            long n = input.nextLong();
            long[] s = new long[20];
            int dem = 0;
            long sum = 0;
            while(n > 0){
                s[dem++] = n % 10;
                sum += n%10;
                n /= 10;
            }   
            if(sum % 10 == 0 && kiemtra(s,dem)==1){
                System.out.println("YES");             
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
