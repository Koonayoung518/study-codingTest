package com.example.prepareCodingTest.Level1;

public class DotProduct {
    /*
    <문제>
    길이가 같은 두 1차원 정수 배열 a,b가 매개변수로 주어진다.
    a와 b의 내적을 return

    내적?
    a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
     */
    public int solution(int[] a, int[] b){
        int answer =0;
        for(int i=0; i<a.length; i++){
            answer+= a[i]* b[i];
        }
        return answer;
    }
}
