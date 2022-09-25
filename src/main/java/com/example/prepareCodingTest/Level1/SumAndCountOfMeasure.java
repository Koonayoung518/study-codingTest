package com.example.prepareCodingTest.Level1;

public class SumAndCountOfMeasure {
    /*
    <문제>
    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    약수의 개수가 홀수인 수는 뺀 수를 return

    **약수가 홀수인지 짝수인지 확인하는 방법
     제곱수인 경우 약수의 개수가 홀수
     ex) 4 (1,2,4)
     제곱수가 아닌 경우 약수의 개수가 짝수
     */
    public int solution(int left, int right){
        int answer =0;
        int cnt;
        for(int i=left; i<=right;i++){
            cnt=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return  answer;
    }
}
