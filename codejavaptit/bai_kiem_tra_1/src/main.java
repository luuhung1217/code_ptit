
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        so_nguyen n = new so_nguyen();
        
        xau s = new xau();
        boolean check = true;
        while(check){
            System.out.println("-----------------------Menu------------------");
            System.out.println("|1.Nhap vao so nguyen duong n               |");
            System.out.println("|2.Viet ra cac uoc so nguyen to cua n       |");
            System.out.println("|3.Viet ra day so fibonacci nho hon n       |");
            System.out.println("|4.Nhap vao 1 xau                           |");
            System.out.println("|5.Dua ra so cau                            |");
            System.out.println("|6.Chuan hoa ho ten                         |");
            System.out.println("|7.Nhap vao da thuc                         |");
            System.out.println("|8.Tinh gia tri da thuc tai x = 2           |");
            System.out.println("|9.Tinh P^n(x)/Q^m(x) va da thuc du         |");
            System.out.println("---------------------------------------------");
            System.out.print("Lua chon: ");
            int chon = input.nextInt();
            switch(chon){
                case(1)->{
                    System.out.print("Nhap vao so nguyen duong nv");
                    n.nhap();
                }
                case(2)->{
                    System.out.print("Viet ra cac uoc so nguyen to cua n ");
                    n.ngto();
                }
                case(3)->{
                    System.out.print("Viet ra day so fibonacci nho hon n ");
                    n.fibo();
                }
                case(4)->{
                    System.out.print("Nhap vao 1 xau ");
                    s.nhap();
                }
                case(5)->{
                    System.out.print("Dua ra so cau ");
                    s.socau();
                }
                case(6)->{
                    System.out.print("Chuan hoa ho ten ");
                    s.chuan_hoa();
                }
                case(7)->{
                    System.out.print("Tinh gia tri da thuc tai x = 2 ");
                    s.nhap();
                }
                case(8)->{
                    System.out.print("");
                    
                }
                case(9)->{
                    System.out.print("");
                    
                }
                default ->{
                    System.out.print("Bye!");
                        check = false;
                }
            }
        }
    }
}
