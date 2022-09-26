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

    @Test
    @DisplayName("이진 변환")
    void BinaryTransformationTest(){
        BinaryTransformation binaryTransformation = new BinaryTransformation();
        int[] answer = binaryTransformation.solution("110010101001");
        System.out.println(answer[0]+" "+ answer[1]);
        int[] answer1 = binaryTransformation.solution("01110");
        System.out.println(answer1[0]+" "+ answer1[1]);
        int[] answer2 = binaryTransformation.solution("1111111");
        System.out.println(answer2[0]+" "+ answer2[1]);
    }

    @Test
    @DisplayName("최솟값 만들기")
    void MakeMinTest(){
        MakeMin makeMin = new MakeMin();
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        int answer = makeMin.solution(A,B);
        System.out.println(answer);
        int[] C = {1,2};
        int[] D = {3,4};
        int answer1 = makeMin.solution(C,D);
        System.out.println(answer1);

    }
}
