class Solution {
    public int solution(String name) {
        int leftRight = name.length() - 1;
        int upDown = 0;

        for (int i = 0; i < name.length(); i++) {
            int idx = i + 1;

            while (idx < name.length() && name.charAt(idx) == 'A') {
                idx++;
            }

            leftRight = Math.min(leftRight, Math.min(i * 2 + name.length() - idx, i + (name.length() - idx) * 2));
            upDown += Math.min(name.charAt(i) - 'A', 'Z' + 1 - name.charAt(i));
        }

        return leftRight + upDown;
    }
}