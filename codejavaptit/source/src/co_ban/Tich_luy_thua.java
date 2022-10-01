
package co_ban;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tich_luy_thua {
    static int modul = (int) (1e9+7);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean ok = true;
        while(ok){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b==0){
                ok = false;
            }
            else{
            System.out.println(luythua(a,b));
            }
        }
    }
    public static long luythua(long a ,long b){
        if(b == 0) return 1;
        long x = luythua(a,b/2);
        if(b % 2 == 0) return (x*x)%modul;
        return a*(x * x %modul) % modul;
    }
}
 
