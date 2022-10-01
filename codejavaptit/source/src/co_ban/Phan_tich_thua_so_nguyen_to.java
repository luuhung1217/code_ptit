
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Phan_tich_thua_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j =1 ;j <= test; j++){
            int a = sc.nextInt();
            System.out.print("Test " + j + ": ");
            for(int i = 2; i <= a; i++){
                int dem = 0;
                while(a % i == 0){
                    a /= i;
                    dem++;
                }
                if( dem > 0 ){
                    System.out.print(+ i + "("+ dem + ")" + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
