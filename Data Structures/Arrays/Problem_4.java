public class Problem_4{

    public static int trappedWater(int[] heights){
        int n = heights.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int water = 0;

        leftMax[0] = heights[0];
        rightMax[n-1] = heights[n-1];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1],heights[i]);
        }
        
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1],heights[i]);
        }

        for(int i=0; i<n; i++){
            int levelHeight = Math.min(leftMax[i],rightMax[i]);
            water += levelHeight - heights[i];
        }

        return water;
    }

    public static int trap(int[] height){
        int n = height.length;

        int res = 0, l=0, r=n-1;
        int rMax = height[r], lMax = height[l];

        while(l<r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax,height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax,height[r]);
                res += rMax - height[r];
            }
        }

        return res;
    }


    public static void main(String[] args){
        int[] heights = {4,2,0,3,2,5};
        // {0,1,0,2,1,0,1,3,2,1,2,1};

        int water = trappedWater(heights);

        System.out.println(water);

        int[] newheights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int newwater = trap(newheights);
        System.out.println(newwater);
    }
}