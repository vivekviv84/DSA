class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map =new HashMap<>();
        HashMap<Character,Character> map1 =new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) != d){
                    return false;
                }
            }
            else{
                map.put(c, d);
            }
            if(map1.containsKey(d)){
                if(map1.get(d) != c){
                return false;
                }
            }
            else{
                map1.put(d,c);
            }
        }return true;
    }   
}   