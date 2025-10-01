import java.util.HashSet;
import java.util.Scanner;

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */

	public static int maxRun(String str) {
        int mAx = 1;
        int current = 1;
        for(int i = 1; i < str.length();i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                current++;
            }
            else {
                current = 1;
            }
            mAx = Math.max(mAx, current);
        }
        return mAx;
    }
    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param str
     * @return max run length
     */

    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                int n = c - '0';
                if (i + 1 < str.length()) {
                    char next = str.charAt(i + 1);
                    for (int j = 0; j < n; j++) {
                        result.append(next);
                    }
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param
     * @return max run length
     */

    public static boolean stringIntersect(String a, String b, int len) {
        if (len <= 0 || a.length() < len || b.length() < len) return false;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            set.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; i++) {
            if (set.contains(b.substring(i, i + len))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(blowup(s));
//        System.out.println(maxRun(s));
        String s1 = sc.next();
        String s2 = sc.next();
        int len = sc.nextInt();
        System.out.println(stringIntersect(s1, s2, len));
    }
}
