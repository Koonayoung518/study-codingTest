package com.example.prepareCodingTest.Level1;

public class AddNotExistNumber {
    /*
    0부터 9까지의 숫자 중 일부가 들어 있는 정수 배열 numbers가 매개변수로 주어진다.
    numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한다.
     */
    public int solution(int[] numbers){
        int answer = 1+2+3+4+5+6+7+8+9;
        for(int i=0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}
