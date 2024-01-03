import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static class Music implements Comparable<Music> {
        private int played;
        private int idx;

        public Music(int played, int idx) {
            this.played = played;
            this.idx = idx;
        }

        @Override
        public int compareTo(Music other) {
            return other.played - this.played;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, ArrayList<Music>> map2 = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            map1.put(genres[i], map1.getOrDefault(genres[i], 0) + plays[i]);

            if (!map2.containsKey(genres[i])) {
                map2.put(genres[i], new ArrayList<>());
            }

            map2.get(genres[i]).add(new Music(plays[i], i));
        }

        List<Map.Entry<String, Integer>> entries = map1.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toList());

        for (Map.Entry<String, Integer> entry : entries) {
            ArrayList<Music> arr = map2.get(entry.getKey());

            Collections.sort(arr);

            for (int i = 0; i < Math.min(arr.size(), 2); i++) {
                answer.add(arr.get(i).idx);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}