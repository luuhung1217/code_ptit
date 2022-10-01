
import java.util.Scanner;


public class Kiem_tra_so_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            if(a == 0|| a == 1){
                System.out.println("YES");
            }
            else{
                long fn = 1,fib1 = 0, fib2 = 1;
                while(fn < a){
                    fn = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fn;
                }
                if(fn == a){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }    
            }
            
            
        }
    }
}
