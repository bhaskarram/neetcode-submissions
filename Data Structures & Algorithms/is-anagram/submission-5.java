class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> sc = new HashMap<>();
        HashMap<Character, Integer> tc = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            sc.put(s.charAt(i), sc.getOrDefault(s.charAt(i),0)+1);
            tc.put(t.charAt(i), tc.getOrDefault(t.charAt(i),0)+1);
        }
        return sc.equals(tc);
    }
}