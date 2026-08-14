class SmallestInfiniteSet {

    private int next = 1;

    private PriorityQueue<Integer> pq = new PriorityQueue<>();

    private HashSet<Integer> set = new HashSet<>();

    public SmallestInfiniteSet() {
    }

    public int popSmallest() {

        if (!pq.isEmpty()) {
            int smallest = pq.poll();
            set.remove(smallest);
            return smallest;
        }

        return next++;
    }

    public void addBack(int num) {

        if (num < next && !set.contains(num)) {
            pq.offer(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */