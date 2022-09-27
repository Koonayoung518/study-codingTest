package com.example.prepareCodingTest.Level2;

import java.util.*;
public class CorrectParenthesis {
    /*
    <문제>
    괄호가 바르게 짝지어져있다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻이다.
    '(' 또는 ')'로만 이루어진 문자열이 주어졌을 때,
    문자열이 올바른 괄호면 true를, 올바르지 않은 괄호이면 false를 return
     */
    /*
    substring 두 번 썼더니 시간 초과
    charAt()으로 해도 될듯
    Stack.peek() -> 맨 위의 값 출력
     */
    public boolean solution(String s){
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        for(int i=0; i< s.length();i++) {
            if (s.substring(i, i + 1).equals("(")) {
                stack.push("(");
            } else {
                if (stack.empty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.empty())
            answer =false;
        return answer;
    }

}
