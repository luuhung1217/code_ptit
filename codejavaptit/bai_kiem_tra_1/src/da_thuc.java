
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class da_thuc {
    private int k;
    private int p[] =new int[100];
    
    public void da_thuc(){
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        for(int i = 0; i < k;i++){
            p[i] = input.nextInt();
        }
    }
}
