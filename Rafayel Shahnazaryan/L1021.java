class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] answer = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        
        while (i<j) {
            
            int sum = numbers[i] + numbers[j];
            
            if(sum == target) {
                answer[0] = i+1;
                answer[1] = j+1;
                break;
            }
            if(sum > target) {
                j--;
            } else i++;
            
        }
        
        
        return answer;
        
    }
}
