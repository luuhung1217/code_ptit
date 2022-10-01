
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class So_chinh_phuong {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        boolean ok = true;
        while (ok){
            int n = nhap.nextInt();
            float k = (float)sqrt(n);
            int h = (int) sqrt(n);
            if ( h== k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
            if ( t==0) ok = false;
        }
        
    }
}
