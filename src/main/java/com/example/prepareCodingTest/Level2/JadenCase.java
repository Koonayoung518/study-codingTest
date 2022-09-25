package com.example.prepareCodingTest.Level2;

public class JadenCase {
    /*
    <문제>
    JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열이다.
    [제한 조건]
    - s는 알파벳과 숫자, 공백문자("")로 이루어져 있다.
    - 숫자는 단어의 첫 문자로만 나온다.
    - 숫자로만 이루어진 단어는 없다.
    - 공백문자가 연속해서 나올 수 있다. ***
     */

    /* 고려할 점
     - 중간에 공백이 두 개일 경우-> 배열에 빈문자열로 들어감(해결)
     - 맨 앞 글자랑 같은 글자가 있을 경우 -> replaceFirst 사용 (해결)
     - 맨 뒤에 공백 있을 경우 -> split에 limit을 둠(해결)
        split(String regex, int limit)
        #1
        If the limit is zero then the pattern will be applied as many times as possible,
        the array can have any length, and trailing empty strings will be discarded.
        (제한이 0이면 패턴이 가능한 한 많이 적용되고 배열의 길이는 제한되지 않으며 **후행 빈 문자열은 삭제됩니다.)
        #2
        If the limit is negative then the pattern will be applied as many times as possible
        and the array can have any length
        (제한이 음수이면 패턴이 가능한 한 많이 적용되고 배열의 길이는 제한되지 않습니다.)
    */
    /*
    배열 길이 : length
    문자열 길이 : length()
    숫자 아스키 코드 : 48~57
    **/
    public String solution(String s){
        String answer ="";
        String[] str = s.toLowerCase().split(" ",-200);
        for(int i=0; i< str.length; i++){
            if(str[i].length()==0) {
                if(i != str.length-1)//마지막 빈문자열이 아닐 경우
                    //단어 뒤에 매번 공백을 추가해 answer에 저장하기 때문에 공백이 하나 더 생기는 걸 방지
                    answer += " ";
                continue;
            }
            Character first = str[i].charAt(0);
            if(!(first>=48 && first<=57)){//첫 글자가 숫자가 아니면
              str[i] = str[i].replaceFirst(String.valueOf(first), String.valueOf(first).toUpperCase());
            }

            answer+= str[i];
            if(i != str.length-1){
                answer+=" ";
            }
        }
        return answer;
    }
}
