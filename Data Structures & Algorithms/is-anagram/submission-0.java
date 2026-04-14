class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                int occurence = map1.get(s.charAt(i));
                map1.put(s.charAt(i), occurence + 1);
            } else {
                map1.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (map2.containsKey(t.charAt(j))) {
                int occurence = map2.get(t.charAt(j));
                map2.put(t.charAt(j), occurence + 1);
            } else {
                map2.put(t.charAt(j), 1);
            }
        }

        if (map1.equals(map2)) {
            return true;
        } else {
            return false;
        }
    }
}
