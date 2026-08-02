class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // If number already exists in set → duplicate found
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise add it to the set
            seen.add(num);
        }
        // No duplicates found
        return false;   
    }
}