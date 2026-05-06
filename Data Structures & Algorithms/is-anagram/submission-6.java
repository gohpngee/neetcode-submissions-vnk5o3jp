class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s_map.containsKey(s.charAt(i))) {
                int counter = s_map.get(s.charAt(i));
                s_map.put(s.charAt(i), counter + 1);
            } else {
                s_map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t_map.containsKey(t.charAt(i))) {
                int counter = t_map.get(t.charAt(i));
                t_map.put(t.charAt(i), counter + 1);
            } else {
                t_map.put(t.charAt(i), 1);
            }
        }

        return s_map.equals(t_map);
    }
}
