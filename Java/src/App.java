import java.util.Arrays;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] jobs = {{0,3},{1,9},{1,5},{1,13},{2,6}};

        //System.out.println(queue);
        solution(jobs);
    }

    public static int solution(int[][] jobs){
        int answer = 0; // 작업 평균 시간
        // 1. 요청시간 빠른 것 먼저 처리
        // 2. 같은 요청 시간 경우 작업 시간 빠른 것 먼저 처리

        int numOfJobs = jobs.length; // 전체 작업 갯수

        // 2차원 배열 오름차순 정리
        Arrays.sort(jobs, (o1,o2)->{
            if(o1[0]==o2[0]){
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        System.out.println(jobs.length);

        for(int i=0; i<jobs.length; i++) {
            for(int j=0; j<jobs[i].length; j++){
                System.out.print(jobs[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        return answer;
    }
}
