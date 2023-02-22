class Solution {
    public int shipWithinDays(int[] weights, int days) {
            int l = Arrays.stream(weights).max().getAsInt();
    int r = Arrays.stream(weights).sum();

    while (l < r) {
      final int m = (l + r) / 2;
      if (shipDays(weights, m) <= days)
        r = m;
      else
        l = m + 1;
    }
    return l;
  }

  private int shipDays(int[] weights, int shipCapacity) 
  {
    int days = 1;
    int capacity = 0;
    for (final int weight : weights) 
    {
      if (capacity + weight > shipCapacity) 
      {
        ++days;
        capacity = weight;
      } 
      else
        capacity += weight;
    }
    return days;

        // int maxWeight = -1, totalWeight = 0;
        // for (int weight : weights) {
        //     maxWeight = Math.max(maxWeight, weight);
        //     totalWeight += weight;
        // }
        // int left = maxWeight, right = totalWeight;
        // while (left < right) {
        //     int mid = (left + right) / 2;
        //     int daysNeeded = 1, currWeight = 0;
        //     for (int weight : weights) {
        //         if (currWeight + weight > mid) {
        //             daysNeeded++;
        //             currWeight = 0;
        //         }
        //         currWeight += weight;
        //     }
        //     if (daysNeeded > days) {
        //         left = mid + 1;
        //     } else {
        //         right = mid;
        //     }
        // }
        // return left;

    }
}