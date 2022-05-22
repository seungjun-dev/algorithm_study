package PriorityQue;

import java.util.PriorityQueue;

public class ScovilleFood {
    public static void main(String[] args) throws Exception {
        System.out.println("More Spicy!");
        int[] food = { 1, 2, 3, 9, 10, 12 };

        solution(food, 10);
    }

    public static int solution(int[] food, int K) {
        int answer = 0;
        int firstFood = 0;
        int secondFood = 0;
        int mixedFood = 0;
        // 우선순위 큐 사용하여 리스트 정렬
        // 당초 그냥 큐로 사용하여 풀었으나 뒤에 다시 정렬해야하는 상황 발생
        // 시간 초과 우려하여 우선순위 큐로 바꿈
        PriorityQueue<Integer> foodQue = new PriorityQueue<Integer>();

        // 큐에 food 리스트 추가
        // int[] -> int 바로 변환하며 큐에 추가할 수 있는 방법이 있는지 궁금합니다...
        for (int i = 0; i < food.length; i++) {
            foodQue.add(food[i]);
        }

        while (!foodQue.isEmpty()) {

            if (foodQue.peek() >= K) {
                return answer;
            }

            if (foodQue.size() == 1 && foodQue.peek() < K) {
                answer = -1;
                return answer;
            }

            firstFood = foodQue.poll();
            secondFood = foodQue.poll();

            mixedFood = firstFood + (secondFood * 2);

            foodQue.offer(mixedFood);
            answer++;
        }

        return answer;
    }
}
