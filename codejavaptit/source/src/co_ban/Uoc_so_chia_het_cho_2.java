
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            long a = sc.nextLong();
            long dem = 0 ;
            if(a % 2 == 0){
                dem++;
            }
            long k = (long) sqrt(a);
            if(k % 2 == 0 && k*k == a){
                dem++;
            }
            for(int j = 2; j < sqrt(a);j++){
                if(a % j == 0){
                    if(j % 2 == 0){
                        dem++;
                    }
                    if((a / j) % 2 == 0){
                        dem++;
                    }
                }
            }
            System.out.println(dem);
        }
    }
}
