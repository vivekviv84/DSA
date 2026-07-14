class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> ans = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            ans.put(c, ans.getOrDefault(c,0)+1);
        }
        ArrayList<Character>[] bucket = new ArrayList[n+1];
        for(Map.Entry<Character, Integer> entry : ans.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(ch);
        }

        for(int freq = n; freq >=1; freq--){

            if(bucket[freq] == null){
                continue;
            }

            for(char ch: bucket[freq]){
                for(int i =0; i<freq; i++){
                    answer.append(ch);
                }
            }
        }return answer.toString();
    }
}