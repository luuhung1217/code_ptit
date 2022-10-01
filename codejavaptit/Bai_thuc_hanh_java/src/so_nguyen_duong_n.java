
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class so_nguyen_duong_n {
    private int n;
    public so_nguyen_duong_n(){
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
    }
    public void tong(){
        System.out.println((n*(n+1))/2);
    }
    public boolean kt(int m){
        for(int i = 2;i <= sqrt(m);i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
    public void nto(){
        for(int i = 2; i<= n;i++){
            if(kt(i) == true){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }
}
