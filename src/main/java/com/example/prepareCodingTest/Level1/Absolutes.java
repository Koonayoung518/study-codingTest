package com.example.prepareCodingTest.Level1;

public class Absolutes {
    /*
    절댓값이 차례대로 담은 정수 배열 absolutes,
    이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어진다.
    실제 정수들의 합을 구하여 return
     */
    public int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for (int i=0; i< absolutes.length; i++){
            if(signs[i] == true){
                answer+=absolutes[i];
            }else{
                answer-=absolutes[i];
            }
        }
        return answer;
    }
}
