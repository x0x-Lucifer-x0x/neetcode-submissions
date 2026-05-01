class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int s : stones){
            heap.add(-s);
        }

        while(heap.size() > 1){
            int heavy = heap.poll();
            int sndheavy = heap.poll();
            if (sndheavy != heavy){
                heap.offer(heavy - sndheavy);
            }
        }

        heap.offer(0);
        return Math.abs(heap.peek());
    }
}
