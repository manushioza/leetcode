class Solution {
    public boolean isPalindrome(int x) {
       boolean ans = false;
        String y = Integer.toString(x);
        if(x < 0){
           ans = false;
          
        }
        else if (y.length() == 1){
            ans = true;
          
        }
        else{
            int right =  y.length() - 1;
            for (int left = 0; left < right; left++){
                if((y.charAt(left) == y.charAt(right))){
                    ans = true;
                }
                else{ 
                    ans = false;
                    break;
                }
                right--;
            }   
        } 
    return ans;
    }

}