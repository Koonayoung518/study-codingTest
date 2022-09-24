package com.example.prepareCodingTest.Level1;
import java.util.*;
public class LackPrice {
    /*
    <문제>
    놀이공원 원래 이용료는 price인데, 놀이기구를 N번 째 이용한다면 이용료의 N를 받는다.
    즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째는 300으로 요금이 인상된다.
    놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return
    금액이 부족하지 않으면 0을 return
     */
    /*
    고려할 점
    - 부족한 금액이 일정 수준을 넘어가면 0으로 반환 -> money를 long으로 형변환
     */
    /*
    0과 비교해야하므로 if문 보다는 Math.max 사용하면 좀 더 간결함
    ex) Math.max(-remain, 0)
     */
    public long solution(int price, int money, int count){
        long answer = -1;
        long remain = money;
        for(int i=1; i<=count;i++){
            remain-= price*i;
        }
        if(remain >= 0)
            answer = 0;
        else
            answer = -remain;

        return answer;
    }
}
