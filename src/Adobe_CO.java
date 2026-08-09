public class Adobe_CO {
    public static Integer returnSum(int n, String signs, long[] cost) {
        long sum = 0;
        for (int start = 0; start < n; start++) {
            char[] dir = signs.toCharArray();
            int pos = start;
            long total = 0;
            while (pos >= 0 && pos < n) {
                total += cost[pos];
                char old = dir[pos];
                dir[pos] = (dir[pos] == '<') ? '>' : '<';
                if (old == '<') {
                    pos--;
                } else {
                    pos++;
                }
            }
            sum+=total;
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        String s = "><><>";
        long[] cost = {3,2,4,1,5};
        System.out.println(returnSum(n,s,cost));
    }
}
