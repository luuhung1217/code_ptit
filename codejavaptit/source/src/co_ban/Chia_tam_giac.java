import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Chia_tam_giac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double a = sc.nextDouble();
            double h = sc.nextInt();
            for(int i = 1;i < a;i++){
                double kq = h*((double)sqrt(i/a));
                System.out.printf("%.6f ",kq);
            }
            System.out.print("\n");
        }
    }
    
}
