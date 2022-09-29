package com.example.prepareCodingTest.Level1;

public class RankingLotto {
    /*
    <문제>
    로또 일부 번호를 알아 볼 수 없게 되었다.
    당첨 번호 발표 후, 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶다.
    알아볼 수 없는 번호는 0으로 표기
     */
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero =0;
        int correct = 0;
        for(int i =0; i<6; i++){
            if(lottos[i] == 0){
                zero++;
            }else{
                for(int j=0; j<6; j++){
                    if(lottos[i] == win_nums[j])
                        correct++;
                }
            }
        }
        answer[0] = correct+zero <=1 ? 6 : 7-(correct+zero);
        answer[1] = correct<=1 ? 6 : 7-correct;

        return answer;
    }
}
