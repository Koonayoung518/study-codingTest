package com.example.prepareCodingTest.Level1;
import java.util.*;
public class AddChoice {
    /*
    <문제>
    정수 배열에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    배열에 오름차순으로 담아 return
     */
    public int[] solution(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i< numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!list.contains(numbers[i] + numbers[j]))
                    list.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
