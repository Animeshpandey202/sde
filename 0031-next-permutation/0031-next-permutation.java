class Solution {
    
    public void reverse(int[] nums,int start,int end){
        
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
    
    
    
    public void nextPermutation(int[] nums) {
        
        //try to find a permutation ie almost similar to prev just minimal change from right side
        // to get next permutation
        

        //travel frm left find break point exp ar= .....4,5,3,1  so next permu will be ...... 5,1,3,4
        //so breaking point is when a[i] <a[i+1] note after bp el are in desc order
        
        int bp=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                bp=i;
                break;
                
            }
        }
        
        
        //if bp not found return nums by reversing it else find smallest .then bp elem from right hsnd side
        
        if(bp==-1){
            reverse(nums,0,n-1);
            
        }
        else{
            
            for(int i=n-1;i>bp;i--){
                if(nums[i]>nums[bp]){
                    int temp=nums[i];
                    nums[i]=nums[bp];
                    nums[bp]=temp;
                    break;
                }
            }
            
            reverse(nums,bp+1,n-1);
               
            
            
        }
        
        
        
    
        
        
    }
}