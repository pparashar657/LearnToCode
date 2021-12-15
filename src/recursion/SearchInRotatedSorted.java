package recursion;

public class SearchInRotatedSorted {

	public int search(int[] nums, int target) {
//      int start = 0;
//      int end = nums.length - 1;
     
//      while(start <= end) {
//          int mid = (start + end) / 2;
         
//          if(nums[mid] == target) 
//              return mid;
         
//          if(nums[start] <= nums[mid]) {
//              if(target >= nums[start] && target < nums[mid]) {
//                  end = mid - 1;
//              } else {
//                  start = mid + 1;
//              }
//          } else {
//              if(target > nums[mid] && target <= nums[end]) {
//                  start = mid + 1;
//              } else {
//                  end = mid - 1;
//              }
//          }
         
//      }
     
//      return -1;
     
     return helper(nums, target, 0, nums.length - 1);
     
 }
 
 int helper(int[] nums, int target, int start, int end) {
     
     if (start > end) {
         return -1;
     }
     
     while(start <= end) {
         int mid = (start + end) >> 1;
         
         if(nums[mid] == target) 
             return mid;
         
         if(nums[start] <= nums[mid]) {
             if(target >= nums[start] && target < nums[mid]) {
                 return helper(nums, target, start, mid - 1);
             } else {
                 return helper(nums, target, mid + 1,end);
             }
         } else {
             if(target > nums[mid] && target <= nums[end]) {
                 return helper(nums, target, mid + 1,end);
             } else {
                 return helper(nums, target, start, mid - 1);
             }
         }
         
     }
     return -1;
 }
 

}
