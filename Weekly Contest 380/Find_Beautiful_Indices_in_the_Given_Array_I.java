

public class Find_Beautiful_Indices_in_the_Given_Array_I {
    public static List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> beautifulIndices = new ArrayList<>();

        for (int i = 0; i <= s.length() - a.length(); i++) {
            if (s.startsWith(a, i)) {
                int start = Math.max(0, i - k);
                int end = Math.min(s.length() - b.length(), i + k);

                for (int j = start; j <= end; j++) {
                    if (s.startsWith(b, j)) {
                        beautifulIndices.add(i);
                        break;
                    }
                }
            }
        }

        return beautifulIndices;
    }
}
