class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> s2 = new HashMap<>();
        if(s.length()!=t.length())
           return false;
        for(char c : s.toCharArray()){
            if(s1.containsKey(c))
               s1.put(c, s1.get(c)+1);
            else 
               s1.put(c,1);   
        }
        for(char c : t.toCharArray()){
            if(s2.containsKey(c))
               s2.put(c, s2.get(c)+1);
            else 
               s2.put(c,1);   
        }
        for(char c : s1.keySet()){
            if(!s2.containsKey(c) || !s2.get(c).equals(s1.get(c)))
               return false;
        }
        return true;
    }
}
