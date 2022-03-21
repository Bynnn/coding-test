package com.company.step02;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.19 - if문

<2753번>
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 */

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        if(year%4==0){
            if(year%100==0) {
                if (year%400 == 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            else
                System.out.print(1);
        }
        else
            System.out.print(0);
    }
}
