package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        System.out.println("Nhap vao 4 so nguyen a, b, c, d: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int temp;
        if(a==b && a==c && a==d){
            System.out.println("Khong ton tai so lon thu hai");
        } else{
            if(a > b){
                temp = a;
                a = b;
                b = temp;
            }
            if(a > c){
                temp = a;
                a = c;
                c = temp;
            }
            if(a > d){
                temp = a;
                a = d;
                d = temp;
            }
            if(b > c){
                temp = b;
                b = c;
                c = temp;
            }
            if(b > d){
                temp = b;
                b = d;
                d = temp;
            }
            if(c > d){
                temp = c;
                c = d;
                d = temp;
            }
            System.out.println("So lon thu hai la:"+c);
        }


    }
}
