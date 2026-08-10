public class Largest_Prime_Find {
    public static boolean prime(long n) {
        if (n <= 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
    public static long largest_Prime(String str) {
        long ans = -1;
        for (int i = 0; i < str.length(); i++) {
            long num = 0;
            for (int j = i; j < str.length(); j++) {
                num = num * 10 + (str.charAt(j) - '0');
                if (prime(num)) {
                    ans = Math.max(ans, num);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "2011129029302380";
        System.out.println(largest_Prime(s));
    }
}
