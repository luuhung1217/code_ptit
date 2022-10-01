
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ma_tran_vuong {
    private int a[][] = new int[100][100],n;
    public ma_tran_vuong(){
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = input.nextInt();
            }
        }
    }
    public void tong(){
        for(int i = 0;i < n ;i++){
            int sum = 0;
            for(int j = 0;j < n;j++){
                sum += a[i][j];
            }
            System.out.print("Tong hang "+ (i+1)+" la: ");
            System.out.println(sum);
        }
    }
    public void dinh_thuc(){
        int kq = 1;
        for(int i = 0 ;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i == j){
                    kq*=a[i][j];
                }
            }
        }
        System.out.println(kq);
    }
}
