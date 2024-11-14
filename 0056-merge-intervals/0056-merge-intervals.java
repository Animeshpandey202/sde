class Solution {
    public int[][] merge(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
            
        // List<List<Integer<>>arr= new ArrayList<>(Arrays.asList(arry));
        
        
        // List<Integer>cur=arr.get(0);
            
        int [] cur=arr[0];
        
        List<int[]>ans= new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            //if interval overlap cur cur
            if(cur[1]>=arr[i][0]){
                
                //update cur
                cur[1]=Math.max(cur[1],arr[i][1]);
            }
            else{
                ans.add(cur);
                
                cur=arr[i];
            }
            
        }
        ans.add(cur);
        
        return ans.toArray(new int[ans.size()][]);
        
    }
}