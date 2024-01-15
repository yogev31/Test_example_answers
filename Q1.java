public class Q1 {
    public static boolean q1A(int num, String s)
    {
        return s.length() > num;
    }
    public static int q1B(int num, String[] s)
    {
        int count = 0;
        for (String string : s) {
            if (q1A(num, string)) {
                count++;
            }
        }
        return count;
    }

}
