/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        while(true){
            System.out.println("1. nahp");
            System.out.println("2. viet");
            System.out.println("3. tuoi");
            System.out.println("4. dat lai");
            
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0-9):");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            switch(chon){
                case 0:System.out.println("bye!!!");
                System.exit(0);//safe exit
                case 1:s.input();
                    break;
                case 2:System.out.println(s);
                    break; 
                case 3:System.out.println("Age:"+s.getAge());
                    break; 
                case 4:int y;
                    System.out.print("Enter new Age:");
                    y=sc.nextInt();
                    s.setBirthYear(y);
                    break;     
                default:
                    System.out.println("phai chon 0-9");
                    break;
            }
            
        }
        
//        //s.code="B8888";
//        s.setCode("B8888");
//        Student s1=new Student("B654",
//                "To an an", 2003,"So 3 chua boc");
//        System.out.println(s.toString());
//        System.out.println(s1);
//        System.out.println("Tuoi:"+(2022-s1.getBirthYear()));
//        Student s2=new Student();
//        s2.input();
//        System.out.println(s2);
//        System.out.println("Age:"+s2.getAge());
//            
    }
}
