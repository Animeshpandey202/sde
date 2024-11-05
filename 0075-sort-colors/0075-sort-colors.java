class Solution {
    public void swap(int[] a,int i,int j){
        
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
        
    }
    
    public void sortColors(int[] nums) {
        
        // //naive approach
        // Arrays.sort(nums);
        
        int low=0;
        int mid=0;
        int high=nums.length-1;
        
        
        while(mid<=high){   //we are checking elem basis of value at mid throughtout the array
            
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++; //as 0 in correct plalce of left most side so shrinnk array to work on
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{  //2 at mid....thus swap high and mid
                
                swap(nums,mid,high);
                high--;   //as 2 in correct right most place so shrink working array
            }
        }
        
        
    }
}