package com.company.step01;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.19

<18108번>
불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
입력 : 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
출력 : 불기 연도를 서기 연도로 변환한 결과를 출력한다.
 */

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        System.out.print(y-543);
    }
}
