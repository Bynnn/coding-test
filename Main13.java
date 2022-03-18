package com.company.step01;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.19

<2588번>
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
   472......(1)
  x385......(2)
---------------
  2360......(3)
 3776 ......(4)
1416  ......(5)
181720......(6)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

 (3) : (1) * (2)의 1의자리
 (4) : (1) * (2)의 10의자리
 (5) : (1) * (2)의 100의자리
 (5) : (1) * (2)
 */
import java.util.Scanner;
public class Main13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int b1=b/100;
        int b2=(b-b1*100)/10;
        int b3=b%10;

        System.out.println(a*b3);
        System.out.println(a*b2);
        System.out.println(a*b1);
        System.out.println(a*b);
    }
}
