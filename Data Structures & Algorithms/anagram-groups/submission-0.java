class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //each item, create map for it
        //compare each map using loop, if equals then add to new array
        //append arrays to another array and return
        Map<String, List<String>> masterMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] wordArray = strs[i].toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if (masterMap.containsKey(sortedWord)) {
                List<String> wordList = masterMap.get(sortedWord);
                wordList.add(strs[i]);
                masterMap.put(sortedWord, wordList); //update value with new item
            } else {
                masterMap.put(sortedWord, new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        return new ArrayList<>(masterMap.values());
    }
}
