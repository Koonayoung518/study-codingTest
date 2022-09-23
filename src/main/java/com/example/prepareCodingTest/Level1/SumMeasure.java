package com.example.prepareCodingTest.Level1;

public class SumMeasure {
    /*
    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
     */
    public int solution(int n){
        int answer =0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){ //나눠 떨어지면 약수
                answer+=i;
            }
        }
        return answer;
    }
}
