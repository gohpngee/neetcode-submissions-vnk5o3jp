class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s_map.containsKey(s.charAt(i))) {
                int s_count = s_map.get(s.charAt(i));
                s_map.put(s.charAt(i), s_count + 1);
            } else {
                s_map.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (t_map.containsKey(t.charAt(j))) {
                int t_count = t_map.get(t.charAt(j));
                t_map.put(t.charAt(j), t_count + 1);
            } else {
                t_map.put(t.charAt(j), 1);
            }
        }

        return (s_map.equals(t_map));
    }
}
