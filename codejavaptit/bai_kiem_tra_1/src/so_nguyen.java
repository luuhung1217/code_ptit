
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
public class so_nguyen {
    private int n;
    public void so_nguyen(){
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
    }
    public boolean kt(int k){
        for(int i = 2;i <= sqrt(k);i++){
            if(k % i == 0){
                return false;
            }
        }
        return true;
    }
    public void ngto(){
        for(int i = 2 ;i <= n;i++){
            if(kt(i) == true){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }
    public void fibo(){
        int fib[] = new int[1000];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i < 100;i++ ){
            fib[i+1] = fib[i]+fib[i-1];
        }
        for(int i = 3;i < 100 ; i++){
            if(fib[i] < n){
                System.out.println(fib[i]+" ");
            }
            else{
                break;
            }
        }
        System.out.print("\n");
    }
}
