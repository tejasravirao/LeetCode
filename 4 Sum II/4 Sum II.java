//Tejas Ravi Rao
//Link => https://leetcode.com/problems/4sum-ii/



class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {      
        
        Map<Integer, Integer> map = new HashMap<>();        
        int n = A.length;
        int result = 0; 
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){

                int sum = C[i] + D[j];                
                map.put(sum, map.getOrDefault(sum,0) + 1);
            }
        }       
        
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                
               int sum = A[i] + B[j]; 
               result = result + map.getOrDefault(-sum, 0);               
            }
        }          
        return result;        
    }
}