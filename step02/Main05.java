package com.company.step02;
//class명은 항상 Main으로
//import java.util.Scanner;
/*
2022.03.19 - if문

<14681번>
45분 일찍 알람 설정하기
입력 : 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 알람 시간 H시 M분을 의미한다.
출력 : 설정해야 하는 알람 시간을 출력한다. 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        int sg_time = (H*60+M) - 45;
        if(sg_time<0)
            sg_time+=24*60;

        System.out.print(sg_time/60);
        System.out.print(" ");
        System.out.print(sg_time%60);
    }
}

//개선된 방법 - Scanner 대신 BufferedReader, StringTokenizer 사용
/*
import java.io.*;
import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int H, M;
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            int sg_time = (H*60+M) - 45;
            if(sg_time<0)
                sg_time+=24*60;

            System.out.print(sg_time/60);
            System.out.print(" ");
            System.out.print(sg_time%60);
        }
    }
 */
