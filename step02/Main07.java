package com.company.step02;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.21 - if문

<2480번>
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
출력 : 첫째 줄에 게임의 상금을 출력 한다.
 */
//https://www.acmicpc.net/problem/2480

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        if(dice1==dice2){
            if(dice1==dice3){
                System.out.println(10000+1000*dice1);

            }else{
                System.out.println(1000+100*dice1);
            }
        }else if(dice1==dice3){
            System.out.println(1000+100*dice1);
        }else if(dice2==dice3){
            System.out.println(1000+100*dice2);
        }else{
            int max = dice1;
            if(max<dice2)
                max=dice2;
            if(max<dice3)
                max=dice3;
            System.out.println(max*100);

        }
    }

}
