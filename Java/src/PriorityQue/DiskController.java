package PriorityQue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public static void main(String[] args) throws Exception {
        System.out.println("Disk Controller!");
        int[][] jobs = {{0,3},{0,7},{1,9},{2,6}};

        //System.out.println(queue);
        solution(jobs);
    }

    public static int solution(int[][] jobs){
        int answer = 0; // 작업 평균 시간
        // 1. 요청시간 빠른 것 먼저 처리
        // 2. 같은 요청 시간 경우 작업 시간 빠른 것 먼저 처리

        int numOfJobs = jobs.length; // 전체 작업 갯수
        int jobTime = 0;
        int totlTime = 0;
        int counter = 0;

        PriorityQueue<Integer> priorityJobQueue = new PriorityQueue<Integer>();

        // 2차원 배열 오름차순 정리
        Arrays.sort(jobs, (o1,o2)->{
            if(o1[0]==o2[0]){
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        System.out.println("numOfJobs: " + numOfJobs);

        for(int i=0; i<jobs.length; i++) {
            
            if(jobs[i][0]<=totlTime) {
                //우선순위 큐에 쌓기
                priorityJobQueue.add(jobs[i][1]);
                System.out.println(priorityJobQueue.toString());
                
            } else {
                totlTime = counter;
                //우선순위 큐에서 작업량이 작은 작업부터처리
                while(priorityJobQueue.isEmpty()){    
                    // 작업 건당 소요 시간 -> 이전 작업 시간 + 작업 처리 시간 - 작업 요청 시간
                    jobTime = jobTime + priorityJobQueue.poll() - jobs[i][0];
                    totlTime += jobTime;
                }

                counter = totlTime;
            }

            //jobTime = jobTime + jobs[i][1] - jobs[i][0];
            //totlTime += jobTime;
             
        }
        System.out.println("totlTime: " + totlTime);
        System.out.println("avgTime:  " + totlTime/numOfJobs);

        return answer;
    }
}
