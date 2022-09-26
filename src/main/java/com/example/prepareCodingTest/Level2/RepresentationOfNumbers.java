package com.example.prepareCodingTest.Level2;

import java.util.*;

public class RepresentationOfNumbers {
    /*
    <문제>
    자연수 n을 연속한 자연수들로 표현하는 방법이 여러 개이다.
    자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return
     */
    public int solution(int n){
        int answer = 1;
        int sum =0;
        Queue<Integer> queue = new LinkedList();
        if(n == 1 || n==2)
            return 1;
        for(int i=1; i<=n/2+2; i++){
            if(sum == n){
                answer++;
            }
            sum+= i;
            queue.offer(i);
            if(sum > n){
                while(sum>n) {
                    if(queue.isEmpty())
                        break;
                    sum -= queue.remove();
                }
            }
        }
        return answer;
    }
}
