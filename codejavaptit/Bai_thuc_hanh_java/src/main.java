
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        so_nguyen_duong_n n = new so_nguyen_duong_n();
        xau s = new xau();
        ma_tran_vuong a= new ma_tran_vuong();
        boolean check = true;
        while(check){
            System.out.println("----------------------Menu----------------------");
            System.out.println("| 1. Nhap vao so nguyen duong n                |");
            System.out.println("| 2. Viet ra tong s=1+2+3+...+n                |");
            System.out.println("| 3. Dua ra day so nguyen to nho hon va bang n |");
            System.out.println("| 4. Nhap vao 1 xau                            |");
            System.out.println("| 5. Dua ra do dai cua xau                     |");
            System.out.println("| 6. Dua ra so cau cua xau                     |");
            System.out.println("| 7. Nhap vao 1 ma tran vuong A                |");
            System.out.println("| 8. Dua ra tong cac hang cua ma tran          |");
            System.out.println("| 9. Tinh dinh thuc cua ma tran A              |");
            System.out.println("------------------------------------------------");
            System.out.print("Lua chon: ");
            int chon = input.nextInt();
            
            switch(chon){
                case 1 ->{
                    System.out.println("Nhap vao so nguyen duong n ");
                    n.nhap();
                }
                case 2 ->{
                    System.out.println("Viet ra tong s=1+2+3+...+n");
                    n.tong();
                }
                case 3 ->{
                    System.out.println("Dua ra day so nguyen to nho hon va bang n");
                    n.nto();
                }
                case 4 ->{
                    System.out.println("Nhap vao 1 xau");
                    s.nhap();
                }
                case 5 ->{
                    System.out.println("Dua ra do dai cua xau");
                    s.dodai();
                }
                case 6 ->{
                    System.out.println("Dua ra so cau cua xau");
                    s.socau();
                }
                case 7 ->{
                    System.out.println("Nhap vao 1 ma tran vuong A");
                    a.nhap();
                }
                case 8 ->{
                    System.out.println("Dua ra tong cac hang cua ma tran");
                    a.tong();
                }
                case 9 ->{
                    System.out.println("Tinh dinh thuc cua ma tran A ");
                    a.dinh_thuc();
                }
                default ->{
                    System.out.println("Bye!");
                    check = false;
                }
            }
        }
    }
}
