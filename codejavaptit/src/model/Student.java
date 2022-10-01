/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;
import java.util.Calendar;
public class Student {
    //thuoc tinh
    private String code;
    private String name;
    private boolean gender;
    private int birthYear;
    private String address;
    //ham tao

    public Student() {
    }

    public Student(String code, String name,
            int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }
    //getter and setter

    public String getCode() {
        return code.toUpperCase();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("code:");
        code=sc.nextLine();
        System.out.print("name:");
        name=sc.nextLine();
        System.out.print("birthYear:");
        birthYear=sc.nextInt();
        sc.nextLine();
        System.out.print("address:");
        address=sc.nextLine();
        
    }
    //lay ra tuoi
    public int getAge(){
        int t=0;
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        t=y-birthYear;
        return  t;
    }
    @Override
    public String toString(){
        return getCode()+"\t"+name+"\t"+
                birthYear+"\t"+address;
    }
    
}
