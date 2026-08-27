class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) + 1);
        }


        for(int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) - 1);
            }
        }

        for(int i : hashMap.values()){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
