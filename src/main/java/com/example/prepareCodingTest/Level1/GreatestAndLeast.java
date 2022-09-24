package com.example.prepareCodingTest.Level1;

public class GreatestAndLeast {
    /*
    <문제>
    두 수의 최대공약수와 최소공배수를 반환
     */
    /*
    유클리드 호제법 이용
     */
    public int gdc(int a, int b){//최대공약수
        if(a<b){ //큰 수가 a에 오도록
            int temp;
            temp = b; //큰 수
            b = a;
            a = temp;
        }
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return  a;
    }
    public int[] solution(int n, int m){
        int[] answer = new int[2];
        answer[0] = gdc(n,m);
        answer[1] = n*m / answer[0]; //최소공배수
        return answer;
    }
}
