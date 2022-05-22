package StackQue;

import java.util.Queue;
import java.util.LinkedList;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = { 9, 2, 3, 4, 5, 6 };
        int location = 0;

        solution(priorities, location);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> waitingQue = new LinkedList<Integer>();
        Queue<Integer> locationQue = new LinkedList<Integer>();

        for (int i = 0; i < priorities.length; i++) {
            waitingQue.add(priorities[i]);
            locationQue.add(i);
        }

        while (waitingQue.size() > 0) {
            boolean isMoreImportant = false;
            int currentWork = waitingQue.poll();
            int currentLocation = locationQue.poll();

            for (int i = 0; i < waitingQue.size(); i++) {
                int waitingWork = waitingQue.peek();
                if (currentWork < waitingWork) {
                    isMoreImportant = true;
                }
            }

            if (isMoreImportant) {
                waitingQue.add(currentWork);
                locationQue.add(currentLocation);
            } else {
                answer++;
                System.out.println(currentLocation + " " + locationQue.peek());

                if (currentLocation == locationQue.peek()) {
                    System.out.println(answer);
                    return answer;
                }
            }
        }

        return answer;
    }
}
