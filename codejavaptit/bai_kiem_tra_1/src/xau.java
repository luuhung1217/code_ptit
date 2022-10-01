
import java.util.Scanner;
import java.util.StringTokenizer;

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
    public void xau(){
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        
    }
    public void socau(){
        String[] danh_sach = s.split("[\\.\\?\\!]");
        System.out.println(danh_sach.length);
    }
    public void chuan_hoa(){
        s = s.replaceAll("\\.\\?\\!", " ");
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        int number = st.countTokens();
        while(st.hasMoreTokens()){
            String tmp =st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            if(st.countTokens() == number-1){
                for(int i = 1;i < tmp.length();i++){
                    kq.append(Character.toUpperCase(tmp.charAt(i)));
                }
            }
            else{
                for(int i = 1;i < tmp.length();i++){
                    kq.append(Character.toLowerCase(tmp.charAt(i)));
                }
            }
            
            if(st.countTokens() > 0 ){
                kq.append(" ");
            }
        }
        
        int check = 0;
        for(int i= 0;i < kq.length();i++){
            if(kq.charAt(i)== ' '){
                check = i;
                break;
            }
        }
        for(int i=check+1;i < kq.length();i++){
            System.out.print(kq.charAt(i));
            if(i == kq.length()-1){
                System.out.print(",");
            }
        }
        System.out.print(" ");
        for(int i=0;i < check;i++){
            System.out.print(kq.charAt(i));
        }
    }
}
