package com.example.prepareCodingTest.Level1;

public class FindRemainder {
    /*
    n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return
     */
    public int solution(int n){
        int answer =0;
        for(int i=2; i<=n-1; i++){
            if((n-1)%i==0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
