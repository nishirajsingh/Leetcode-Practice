class Solution {
    static class MultiSet {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int size = 0;

        void add(int x) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            size++;
        }

        void remove(int x) {
            int cnt = map.get(x);
            if (cnt == 1) {
                map.remove(x);
            } else {
                map.put(x, cnt - 1);
            }
            size--;
        }

        boolean contains(int x) {
            return map.containsKey(x);
        }

        int first() {
            return map.firstKey();
        }

        int last() {
            return map.lastKey();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public long minimumCost(int[] nums, int k, int dist) {
        MultiSet selected = new MultiSet();
        MultiSet rest = new MultiSet();

        long sum = 0;

        for (int i = 1; i <= dist + 1; i++) {
            selected.add(nums[i]);
            sum += nums[i];
        }

        while (selected.size() > k - 1) {
            int x = selected.last();
            selected.remove(x);
            rest.add(x);
            sum -= x;
        }

        long ans = sum;

        for (int i = dist + 2; i < nums.length; i++) {
            int out = nums[i - dist - 1];

            if (selected.contains(out)) {
                selected.remove(out);
                sum -= out;
            } else {
                rest.remove(out);
            }

            int x = nums[i];

            if (!selected.isEmpty() && x < selected.last()) {
                selected.add(x);
                sum += x;
            } else {
                rest.add(x);
            }

            while (selected.size() < k - 1) {
                int v = rest.first();
                rest.remove(v);
                selected.add(v);
                sum += v;
            }

            while (selected.size() > k - 1) {
                int v = selected.last();
                selected.remove(v);
                rest.add(v);
                sum -= v;
            }

            ans = Math.min(ans, sum);
        }

        return nums[0] + ans;
    }
}