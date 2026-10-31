//Finding an element in rotated sorted array

public class Problem_2{

    public static int search(int[] nums, int target){
        int min = minSearch(nums);

        if(nums[0] <= target && nums[min] >= target){
            return binSearch(nums,0,min,target);
        } else {
            return binSearch(nums,min,nums.length-1,target);
        }

    }

    public static int binSearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid=left + (right-left)/2;

            if(nums[mid]==target){
                return mid;
            }else if(target < nums[mid]){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }

    public static int minSearch(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            } else if(nums[left]<nums[mid] && nums[mid] > nums[right]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return left;
    }

    public static void main(String[] args){
        int[] nums = {1};
        int target = 0;

        System.out.println(search(nums,target));

    }
}