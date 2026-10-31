import java.util.Arrays;

public class SubSets {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] selected = new int[nums.length];
        getSubSets(nums, selected,0);
    }   
    
    public static void getSubSets(int[] nums, int selected[], int i){
        if(i == nums.length){
            System.out.println(Arrays.toString(selected));
            return;
        }
        getSubSets(nums, selected, i+1);
        selected[i] = nums[i];
        getSubSets(nums, selected, i+1);
    }
}
