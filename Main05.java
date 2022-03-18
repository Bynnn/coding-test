package com.company.step01;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.19

<1000 번>
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력 : 첫째 줄에 A+B를 출력한다.

 */

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        System.out.print(A+B);
    }
}
