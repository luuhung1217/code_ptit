/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;
public class Main {
    //khong lam cac cau o day
    // lam co cho 1d
    public static void main(String[] args) {
        
        while(true){
            System.out.println("1. chon 1");
            System.out.println("2. chon 2");
            System.out.println("3. chon 3");
            System.out.println("4. chon 4");
            System.out.println("5. chon 5");
            System.out.println("6. chon 6");
            System.out.println("7. chon 7");
            System.out.println("8. chon 8");
            System.out.println("9. chon 9");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0-9):");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            switch(chon){
                case 0:System.out.println("bye!!!");
                System.exit(0);//safe exit
                case 1:System.out.println("ban chon 1");
                    break;
                case 2:System.out.println("ban chon 2");
                    break;    
                default:
                    System.out.println("phai chon 0-9");
                    break;
            }
            
        }
    }
}

