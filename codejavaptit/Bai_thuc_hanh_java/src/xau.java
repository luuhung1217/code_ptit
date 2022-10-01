
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class xau {
    private String s;
    public xau(){
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
    }
    public void dodai(){
        System.out.println(s.length());
    }
    public void socau(){
        String[] danh_sach_cau = s.split("[\\.\\!\\?]");
        System.out.println(danh_sach_cau.length);
    }
}
