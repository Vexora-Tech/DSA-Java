import java.util.*;

public class ArraysCC{
  //Q1
  public static boolean repeat(int nums[]){
    int rep[] = nums;
    for(int i=0; i<nums.length-1; i++){
      for(int j=i+1; j<nums.length; j++){
      if(nums[i] == nums[j]){
        return true;
      }
    }
  }
  return false;
  }
  public static void main(String args[]){
    int nums[] = {1, 2, 3, 4, 5};
    System.out.println(repeat(nums));
  }

  //Q2
  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[left] <= nums[mid]) {
            
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }
        
        else {
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;  
            } else {
                right = mid - 1;
            }
        }
    }

    return -1;
  }  
  public static void main(String args[]){
    int nums[] = {1, 2, 3, 4, 5};
    int target = 5;
    System.out.println(search(nums, target));
  }

  //Q3
  public static int buyAndSellStocks(int price[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i=0; i<price.length; i++){
      if(buyPrice < price[i]){
        int profit = price[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      }else{
        buyPrice = price[i];
      }
    }
    return maxProfit;
  }
  public static void main(String args[]){
    int price[] = {7, 1, 5, 3, 6, 4};
    System.out.println(buyAndSellStocks(price));
  }

  //Q4
  public static int trap(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxLeft = 0;
    int maxRight = 0;
    int water = 0;

    while (left < right) {
        // Process the shorter side
        if (height[left] <= height[right]) {
            if (height[left] >= maxLeft) {
                maxLeft = height[left];  // update max
            } else {
                water += maxLeft - height[left];  // trap water
            }
            left++;
        } else {
            if (height[right] >= maxRight) {
                maxRight = height[right];  // update max
            } else {
                water += maxRight - height[right];  // trap water
            }
            right--;
        }
    }

    return water;
}

  //Q5
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums); // Sort first

    for (int i = 0; i < nums.length - 2; i++) {

        // Skip duplicate values for i
        if (i > 0 && nums[i] == nums[i - 1]) continue;

        // If smallest possible sum is > 0, stop early
        if (nums[i] > 0) break;

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // Skip duplicates for left and right
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;

            } else if (sum < 0) {
                left++;   // Need larger sum
            } else {
                right--;  // Need smaller sum
            }
        }
    }

    return result;
}
}
//Assignment Questions (Arrays)








