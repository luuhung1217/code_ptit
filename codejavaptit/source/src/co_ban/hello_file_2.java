/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class hello_file_2 {
    public static void main(String[] args) 
            throws FileNotFoundException{
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}

