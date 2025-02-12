import java.util.*;

class Mismatch {
    public boolean areEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int m = s1.length();
        int n = s2.length();

        if (m != n) return false; // If lengths are different, return false

        int mismatches = 0;
        List<Character> mismatch = new ArrayList<>();

        for (int pos = 0; pos < m; pos++) {
            if (s1.charAt(pos) != s2.charAt(pos)) {
                mismatch.add(s1.charAt(pos));
                mismatch.add(s2.charAt(pos));
                mismatches++;

                if (mismatches > 2) return false;
            }
        }

        return mismatch.size() == 4 && mismatch.get(0) == mismatch.get(3) && mismatch.get(1) == mismatch.get(2);
    }

    public static void main(String[] args) {
        Mismatch obj = new Mismatch();
        System.out.println(obj.areEqual("abcd", "abdc")); // Example test case
    }
}
