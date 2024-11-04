class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            
            List<Integer>row= new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                
                
                
                if(i==0){
                    row.add(1);
                    
                }
                else{
                    
                    if(j==0||j==i){
                        row.add(1);
                    }
                    else{
                        int pvalue=ans.get(i-1).get(j-1)+ ans.get(i-1).get(j);
                        
                        row.add(pvalue);
                    }
                }
            }
            ans.add(row);
            
            
            
            
            
        }
        return ans;
        
            

    }
}