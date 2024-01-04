import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxQue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQue = new PriorityQueue<>();

        for (String operation : operations) {
            String[] o = operation.split(" ");

            if (o[0].equals("I")) {
                maxQue.offer(Integer.parseInt(o[1]));
                minQue.offer(Integer.parseInt(o[1]));
            } else {
                if (o[1].equals("1")) {
                    minQue.remove(maxQue.poll());
                } else {
                    maxQue.remove(minQue.poll());
                }
            }
        }

        if (!maxQue.isEmpty()) {
            return new int[]{maxQue.poll(), minQue.poll()};
        } else {
            return new int[2];
        }
    }
}