package com.example.prepareCodingTest.Level2;

import java.util.*;
public class MakeMin {
    /*
    배열A,B에서 각각 한 개의 숫자를 뽑아 두 수를 곱한다.
    이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더한다.
    이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표다.
    (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없다.)
     */
    public int solution (int[] A, int[] B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i< A.length; i++){
            answer += A[i]* B[B.length-1-i];
        }
        return answer;
    }
}
