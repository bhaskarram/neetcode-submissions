class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            int delimiterIndex = s.indexOf("#", i);
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            String str = s.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            result.add(str);
            i = delimiterIndex + 1 + length;
        }        
        return result;
    }
}
