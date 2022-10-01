
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class So_nguyen_to {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean check = true;
        while(check){
            long a = sc.nextLong();
            int kt = 0;
            for(int i = 2; i <= sqrt(a); i++){
                if(a % i == 0){
                    kt=1;
                }
            }
            if(kt == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
            if(t == 0) check = false;
        }
    }
}
