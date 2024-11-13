class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<String, Integer> sMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            sMap.put(key, sMap.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            String letter = String.valueOf(t.charAt(i));
            if (!sMap.containsKey(letter)) return false;
            sMap.put(letter, sMap.get(letter) - 1);
            if (sMap.get(letter) == 0) sMap.remove(letter);
        }

        return true;

    }
}