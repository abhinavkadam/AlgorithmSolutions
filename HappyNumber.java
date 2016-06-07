public class Solution {
    public boolean isHappy(int n) {
	        
	        
	       do{
	           n = cal(n);
	       }while(n>9);
	       
	       if(n==1 || n==7)
	    	   	return true;
	       
	       return false;
	    }
	
	private int cal(int n){
	        int sum = 0;
	        int digit = 0;
	        String num = Integer.toString(n);
	        
	        for(int i=0;i<num.length();i++){
	        	digit = num.charAt(i) - '1' + 1;
	        	sum = sum + sq(digit) ; 
	        }
	        

	        return sum;
	    }
	 private int sq(int n){
	        return n*n;
	    }
}