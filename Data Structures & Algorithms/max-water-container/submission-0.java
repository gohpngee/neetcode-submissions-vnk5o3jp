class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, currentHeight * width);

            if (heights[left] < heights[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        return maxArea;
    }
}
