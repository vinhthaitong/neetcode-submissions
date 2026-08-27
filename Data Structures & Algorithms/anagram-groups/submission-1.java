class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();

        for(String s : strs){
            char[] array = new char[26];
            for(char c : s.toCharArray()){
                array[c - 'a']++;
            }
            String key = Arrays.toString(array);
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(s);
        }

        return new ArrayList<>(hashMap.values());
    }
}
