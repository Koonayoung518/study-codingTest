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

    @Test
    @DisplayName("음양 더하기")
    void AbsolutesTest() {
        Absolutes absolutes = new Absolutes();
        int[] abs = {4,7,12};
        boolean[] signs = {true, false, true};
        int answer = absolutes.solution(abs, signs);
        System.out.println(answer);
        int[] abs1 = {1,2,3};
        boolean[] signs1 = {false, false, true};
        int answer1 = absolutes.solution(abs1, signs1);
        System.out.println(answer1);
    }

    @Test
    @DisplayName("없는 숫자 더하기")
    void AddNotExistNumberTest() {
        AddNotExistNumber addNotExistNumber = new AddNotExistNumber();
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = addNotExistNumber.solution(numbers);
        System.out.println(answer);
        int[] numbers1 = {5,8,4,0,6,7,9};
        int answer1 = addNotExistNumber.solution(numbers1);
        System.out.println(answer1);
    }

    @Test
    @DisplayName("내적")
    void DotProductTest() {
        DotProduct dotProduct = new DotProduct();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int answer = dotProduct.solution(a,b);
        System.out.println(answer);

        int[] a1 = {-1,0,1};
        int[] b1 = {1,0,-1};
        int answer1 = dotProduct.solution(a1,b1);
        System.out.println(answer1);
    }

    @Test
    @DisplayName("약수의 개수와 덧셈")
    void SumAndCountOfMeasureTest(){
        SumAndCountOfMeasure sumAndCountOfMeasure = new SumAndCountOfMeasure();
        int answer = sumAndCountOfMeasure.solution(13,17);
        System.out.println(answer);
        int answer1 = sumAndCountOfMeasure.solution(24,27);
        System.out.println(answer1);
    }

    @Test
    @DisplayName("두 개 뽑아서 더하기")
    void AddChoiceTest(){
        AddChoice addChoice = new AddChoice();
        int[] numbers ={2,1,3,4,1};
        int[] answer = addChoice.solution(numbers);
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
        int[] numbers1 ={5,0,2,7};
        int[] answer1 = addChoice.solution(numbers1);
        System.out.println();
        for(int i=0; i<answer1.length; i++){
            System.out.print(answer1[i]+" ");
        }
    }

    @Test
    @DisplayName("부족한 금액 계산하기")
    void LackPriceTest() {
        LackPrice lackPrice = new LackPrice();
        long answer = lackPrice.solution(3,20,4);
        System.out.println(answer);
        long answer1 = lackPrice.solution(2500,10000,2500);
        System.out.println(answer1);
    }

    @Test
    @DisplayName("최대공약수와 최소공배수")
    void GreatestAndLeastTest() {
        GreatestAndLeast greatestAndLeast = new GreatestAndLeast();
        int[] answer = greatestAndLeast.solution(3,12);
        System.out.println(answer[0]+" "+answer[1]);
        int[] answer1 = greatestAndLeast.solution(2,5);
        System.out.println(answer1[0]+" "+answer1[1]);
    }
    }
