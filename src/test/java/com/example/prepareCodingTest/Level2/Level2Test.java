package com.example.prepareCodingTest.Level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Level2Test {
    @Test
    @DisplayName("최댓값과 최솟값")
    void MinAndMaxTest(){
        MinAndMax minAndMax= new MinAndMax();
        String result =  minAndMax.solution("1 2 3 4");
        System.out.println(result);
        String result1 =  minAndMax.solution("-1 -2 -3 -4");
        System.out.println(result1);
        String result2 =  minAndMax.solution("-1 -1");
        System.out.println(result2);
    }

    @Test
    @DisplayName("JadenCase로 변환")
    void JadenCaseTest(){
        JadenCase jadenCase = new JadenCase();
        String result = jadenCase.solution("3people   unFollowed me");
        System.out.println(result+"\"");
        String result1 = jadenCase.solution("for the last week");
        System.out.println(result1+"\"");
        String result2 = jadenCase.solution(" for the total week   ");
        System.out.println(result2+"\"");

    }
}
