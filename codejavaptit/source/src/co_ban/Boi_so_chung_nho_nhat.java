package co_ban;

import java.math.BigInteger;
import java.util.Scanner;

public class Boi_so_chung_nho_nhat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int test = input.nextInt();
            while(test -- > 0){
            String input1 = input.next();
            String input2 = input.next();
            BigInteger a = new BigInteger(input1);
            BigInteger b = new BigInteger(input2);
            BigInteger kq = a.multiply(b).divide(a.gcd(b));
            System.out.println(kq); 
        }
    }
}
