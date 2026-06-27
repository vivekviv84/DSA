1class Solution {
2    public int maximumLength(int[] nums) {
3        int ans = 1;
4        int max = 0;
5        Map<Integer, Integer> map = new HashMap<>();
6
7        for (int num : nums) {
8            map.merge(num, 1, Integer::sum);
9            max = Math.max(max, num);
10        }
11
12        if (map.containsKey(1)) {
13            ans = map.get(1);
14            if (ans % 2 == 0)
15                ans--;
16            map.remove(1);
17        }
18
19        outer: for (Integer num : map.keySet()) {
20            int freq = map.get(num);
21
22            if (freq <= 1)
23                continue;
24
25            int count = 2;
26            while (num <= max) {
27                num *= num;
28                freq = Math.min(freq, map.getOrDefault(num, 0));
29
30                if (freq >= 1)
31                    count += 2;
32
33                ans = Math.max(ans, count - 1);
34
35                if (freq <= 1)
36                    continue outer;
37            }
38        }
39
40        return ans;
41    }
42}