class Solution {
    public int solution(int[] money) {
        int[][] arr = new int[2][money.length];

        arr[0][0] = money[0];
        arr[0][1] = money[0];
        arr[1][0] = 0;
        arr[1][1] = money[1];

        for (int i = 2; i < money.length; i++) {
            arr[0][i] = Math.max(arr[0][i - 2] + money[i], arr[0][i - 1]);
            arr[1][i] = Math.max(arr[1][i - 2] + money[i], arr[1][i - 1]);
        }

        return Math.max(arr[0][money.length - 2], arr[1][money.length - 1]);
    }
}