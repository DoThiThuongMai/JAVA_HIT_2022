package Bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
             n = sc.nextInt();
        }while (n<=0);

        int dem = 0;
        while (n > 0) {
            int du = n % 10;
            int temp = (int)Math.sqrt(du);
            if (temp * temp == du) {
                dem++;
                System.out.print(du + " ");
            }
            n /= 10;
        }
        if (dem == 0) {
            System.out.print("No");
        }
    }
}
