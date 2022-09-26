package com.example.prepareCodingTest.Level1;

public class BringMiddleWord {
    /*
    <문제>
    단어의 가운데 글자를 반환하는 함수
    단어의 길이가 짝수라면 가운데 두글자를 반환
     */
    public String solution(String s){
        String answer = "";
        int length = s.length();
        if(length%2==0){
            answer = s.substring(length/2-1, length/2+1);
        }else{//홀수면
            answer = s.substring(length/2, length/2+1);
        }
        return answer;
    }
}
