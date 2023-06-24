class Solution {
    public int trap(int[] height) {
        if(height.length<=2) return 0;
        int left = 1,right=height.length-2;
        int ans=0;
        int maxLeft = height[0],maxRight=height[height.length-1];
        while(left<=right){
            if(maxLeft<maxRight){
                if(maxLeft<height[left]){
                    maxLeft=height[left];
                }
                else{
                    ans+=maxLeft-height[left];
                }
            left++;
            }
            else{
                if(maxRight<height[right]){
                    maxRight=height[right];
                }
                else{
                    ans += maxRight - height[right];
                }
                right--;
            }
        }
        return ans;
    }
}
