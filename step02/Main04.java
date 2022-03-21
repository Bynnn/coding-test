package com.company.step02;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.19 - if문

<14681번>
점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
입력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
출력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
 */

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        if (x > 0) {
            if (y > 0)
                System.out.print(1);
            else
                System.out.print(4);
        }
        else {
            if (y > 0)
                System.out.print(2);
            else
                System.out.print(3);
        }
    }
}
