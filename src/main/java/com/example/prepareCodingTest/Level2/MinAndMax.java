package com.example.prepareCodingTest.Level2;

public class MinAndMax {
    /*
    <문제>
    * 문자열 s에 공백으로 구분된 숫자들이 저장되어있다.
    * 이 중 최소값과 최대값을 찾아
    * (최소값)(최대값)형태의 문자열을 반환한다.
    * [제한 조건]
    * s에는 둘 이상의 정수가 공백으로 구분되어 있다.
    * */

    /*
    * 문자열 자를 때 메서드 split이다!!
    * */
    public String solution(String s){
        String answer = "";
        String[] str = s.split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        int current;
        for(int i=1; i<str.length; i++){
            current = Integer.parseInt(str[i]);
            if(current > max){
                max = current;
            }
            if(current < min){
                min = current;
            }
        }
        answer = min+" "+max;
        return answer;
    }
}
