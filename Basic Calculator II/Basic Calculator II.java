// Tejas Ravi Rao
// Link => https://leetcode.com/problems/basic-calculator-ii/

class Solution {
    public int calculate(String s) {       
        
        if(s == null || s.length() == 0)
            return 0;
        
        char[] init = new char[s.length()];
        int n = 0;
        
        for(char c : s.toCharArray()){
            if(c != ' '){
                init[n] = c;
                n++;
            }
        }
        
        int i = 0;
        int num = 0;
        
        while(i<n && '0' <= init[i] && init[i] <= '9'){
            
            //System.out.println("inside num is "+ num);
            num = num * 10 + init[i] - '0';
            
            i++;
        }
        
        //System.out.println("num is "+ num);
        
        int[] stack = new int[n];
        stack[0] = num;
        i = 0;
        int index  = 1;
            
        while(i < n){
            
            char c = init[i];
            i++;
            
            num = 0;
            
            while(i<n && '0' <= init[i] && init[i] <= '9'){
            
                num = num * 10 + init[i] - '0';
                i++;
            }
            
            switch(c){
                    
                case '+':
                    stack[index] = num;
                    index++;
                    break;
                    
                case '-':
                    stack[index] = -num;
                    index++;
                    break;
                    
                case '*':
                    stack[index-1] = stack[index-1] * num;
                    break;
                    
                case '/':
                    stack[index-1] = stack[index-1] / num;
                    break;
            }                  
                
            }
        
        int sum = 0;
        for(int x : stack){
            sum = sum + x;
        }
          
        return sum;
     }       
        
   }
