package com.example.prepareCodingTest.Level2;

public class BinaryTransformation {
    /*
    1. x의 모든 0을 제거한다.
    2. x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꾼다.
    ex) x="0111010"
        "0111010" -> "1111" (c=4) -> "100"
    s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때,
    이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return
    */

    /*
    각 진수로 변환해주는 메서드
      Integer.toBinaryString()
      Integer.toHexString()
      Integer.toOctalString()
    */

    public int[] solution(String s){
        int[] answer = new int[2];
        int c;//길이
        int cnt=0; //변환 횟수
        int remove =0; //제거된 0의 모든 개수
        while (true) {
            c=0;
            if(s.equals("1"))
                break;
            for(int i=0; i<s.length(); i++){
                if(s.substring(i,i+1).equals("0")){
                    remove++;
                }else{
                    c++;
                }
            }
            cnt++;
            s =Integer.toBinaryString(c);
            }
        answer[0] = cnt;
        answer[1] = remove;
        return answer;
    }
}
