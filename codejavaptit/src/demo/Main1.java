/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package demo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        boolean tr;
        String ma;
        double diem;
        String ten;
        x=sc.nextInt();
        tr=sc.nextBoolean();
        ma=sc.next();
        diem=sc.nextFloat();
        sc.nextLine();//enter
        ten=sc.nextLine();
        System.out.println("x="+x+" Co yeu to khong?"+(tr?"co":"khong")+
                " ma:"+ma+" diem:"+diem+" Ten:"+ten);
        
    }
}
