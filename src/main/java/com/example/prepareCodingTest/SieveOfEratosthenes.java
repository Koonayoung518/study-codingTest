package com.example.prepareCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SieveOfEratosthenes {
    /*
    [구름 알고리즘 먼데이 챌린지 1주차 4번 문제]
    정수로 이루어진 수열 에 있는 수들을 합한 값을 구하기로 한다. 하지만 평범한 합하기는 너무 쉽게 구해지기 때문에,
    새로운 조건을 추가하여 값을 추출하고, 추출된 모든 값을 합하기로 한다. 새로운 조건은 아래와 같다.
    - 수열 A의 i번째 수를 Ai라고 부른다.
    - i가 소수인 Ai를 추출한다.
    조건에 따라서 추출된 값들은 모두 합하고, 그 값을 출력한다.

    소수 판별
    - 에라토스테네스의 체 사용
    */
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            int result = 0;
            String[] number = br.readLine().split(" ");
            boolean[] index = new boolean[Integer.parseInt(input)];

            for (int i = 0; i < index.length; i++) {
                if (i == 0)
                    index[i] = false;
                else
                    index[i] = true;
            }

            for (int i = 2; i <= index.length; i++) {
                if (index[i - 1] == true) {
                    for (int j = 2; j * i <= index.length; j++) {
                        index[j * i - 1] = false;
                    }
                }
            }
            for (int i = 0; i < index.length; i++) {
                if (index[i] == true)
                    result += Integer.parseInt(number[i]);
            }
            System.out.println(result);
        }
}
