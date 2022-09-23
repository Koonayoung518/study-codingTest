package com.example.prepareCodingTest.Level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Level1Test {
    @Test
    @DisplayName("약수의 합")
    void SumMeasureTest(){
        SumMeasure sumMeasure = new SumMeasure();
        int answer = sumMeasure.solution(12);
        System.out.println(answer);
        int answer1 = sumMeasure.solution(5);
        System.out.println(answer1);
    }

    @Test
    @DisplayName("나머지가 1이 되는 수 찾기")
    void FindRemainderTest(){
        FindRemainder findRemainder = new FindRemainder();
        int answer = findRemainder.solution(10);
        System.out.println(answer);
        int answer1 = findRemainder.solution(12);
        System.out.println(answer1);
    }
}
