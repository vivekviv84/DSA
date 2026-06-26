1class Solution {
2    public long countMajoritySubarrays(int[] nums, int target) {
3        int n = nums.length;
4        long cnt = 0;
5
6        for (int i = 0; i < n; i++) {
7            if (nums[i] == target) nums[i] = 1;
8            else nums[i] = -1;
9        }
10
11        int[] pref = new int[n];
12        pref[0] = nums[0];
13
14        for (int i = 1; i < n; i++) {
15            pref[i] = pref[i - 1] + nums[i];
16        }
17
18        int shift = n;
19        int[] freq = new int[2 * n + 1];
20
21        freq[shift] = 1;
22
23        long valid = 0;
24        int lastSum = 0;
25
26        for (int i = 0; i < n; i++) {
27            if (pref[i] > lastSum) {
28                valid += freq[lastSum + shift];
29            } else {
30                valid -= freq[pref[i] + shift];
31            }
32
33            cnt += valid;
34            freq[pref[i] + shift]++;
35            lastSum = pref[i];
36        }
37
38        return cnt;
39    }
40}