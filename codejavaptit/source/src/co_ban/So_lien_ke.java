

import java.util.Scanner;

public class So_lien_ke {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -->0){
            long a = sc.nextLong();
            long[] s = new long[20];
            int dem = 0;
            while(a > 0){
                s[dem++] = a % 10;
                a /= 10;
            }
            int check = 0;
            for(int i = 0 ;i < dem-1 ;i++){
                if(s[i]+ 1 == s[i+1] || s[i] == s[i+1] + 1){
                    check++;
                }
            }
            if(check == dem-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
