package Bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        for(a = 1; a < 100; a++){
            for(b = 1; b < 100; b++){
                for(c = 1; c<100; c++){
                    if((a+b+c == 100) && (5*a + 3*b + c/3 == 100)){
                        System.out.println("So trau dung: "+a);
                        System.out.println("So trau nam: "+b);
                        System.out.println("So trau gia: "+c);
                        System.out.println("****************");
                    }
                }
            }
        }
    }
}
