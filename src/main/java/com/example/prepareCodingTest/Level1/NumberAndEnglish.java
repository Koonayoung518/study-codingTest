package com.example.prepareCodingTest.Level1;

public class NumberAndEnglish {
    /*
    <문제> - 2021 카카오 채용연계형 인턴십
    숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 원래 숫자를 찾는 게임
     */
    /*
    String.replace 메서드 사용 할 때 꼭 객체에 저장하기
    ex) s = s.replace();
     */
    public int solution(String s){
        int answer =0;
        String[] number = {"zero", "one", "two", "three", "four", "five",
                        "six", "seven", "eight", "nine"};
        for(int i=0; i< number.length; i++){
            s = s.replaceAll(number[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
