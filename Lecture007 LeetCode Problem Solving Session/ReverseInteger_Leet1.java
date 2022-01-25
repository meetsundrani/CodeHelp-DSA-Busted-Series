class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = sign * x;
        }

        int res = 0;
        while (x > 0) {
            if (res * sign > Integer.MAX_VALUE / 10 || res * sign < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = res * 10 + x % 10;

            x = x / 10;
        }
        return (int)(sign * res);
    }
}
