package BruteForceSearch_level1;
import java.util.Arrays;

public class solution1 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int [][] pattern ={
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };//수포자 답 찍는 패턴 입력

        int [] correct = new int[3];
        for(int i= 0; i<answers.length; i++){ //패턴 반복해서
            if (pattern[0][i%5]==answers[i]){
                correct[0] +=1;
            }
            if (pattern[1][i%8]==answers[i]){
                correct[1] +=1;
            }
            if(pattern[2][i%10]==answers[i]){
                correct[2] +=1;
            }
        }

        int max = correct[0];
        for(int j=0; j<correct.length; j++){ //최대 점수 맞추기
            if (max < correct[j]){
                correct[j] = max;
            }
            System.out.println(max);
        }
        for(int k=0; k<correct.length; k++){ //최대점수 수포자 출력
            if(max==correct[k]){
                answer

            }

        }


        return answer;
    }
}
