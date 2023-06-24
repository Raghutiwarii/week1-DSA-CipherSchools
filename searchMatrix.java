class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int low=0,high=m*n-1;
        while(low<=high) {
            int midIdx,midEle,rowIdx,colIdx;
            
            midIdx=low+(high-low)/2;
            rowIdx=midIdx/n;
            colIdx=midIdx%n;
            midEle=matrix[rowIdx][colIdx];
            if(midEle==target)
            return true;
            else if(midEle<target)
            low=midIdx+1;
            else 
            high=midIdx-1;
        }
        return false;
        
    }
}
