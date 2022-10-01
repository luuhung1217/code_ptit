import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a != 0){
            System.out.printf("%.2f",-1.00*(b/a));
        }
        else if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            }
            else if(b != 0){
                System.out.println("VN");
            }
        }
    }
    
}
