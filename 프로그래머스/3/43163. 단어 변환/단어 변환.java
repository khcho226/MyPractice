import java.util.*;

class Solution {
    public class Word {
        private final String name;
        private final int cnt;

        public Word(String name, int cnt) {
            this.name = name;
            this.cnt = cnt;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        Queue<Word> que = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        que.offer(new Word(begin, 0));

        while (!que.isEmpty()) {
            Word word = que.poll();

            for (int i = 0; i < words.length; i++) {
                if (!visited[i]) {
                    int cnt = 0;

                    for (int j = 0; j < target.length(); j++) {
                        if (word.name.charAt(j) != words[i].charAt(j)) {
                            cnt++;
                        }
                    }

                    if (cnt == 1) {
                        if (words[i].equals(target)) {
                            return word.cnt + 1;
                        }

                        que.offer(new Word(words[i], word.cnt + 1));
                        visited[i] = true;
                    }
                }
            }
        }

        return 0;
    }
}