
import java.util.Scanner;


public class Boi_so_chung_uoc_so_chung {
    public static long uocso(long a, long b){
        if(b == 0) return a;
        return uocso(b , a%b);
    }
    public static long boiso(long a, long b){
        return (a*b)/ uocso(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.print(boiso(a,b) +" "+ uocso(a,b));
            System.out.print("\n");
        }
    }
}
