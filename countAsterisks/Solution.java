package leetcode.countAsterisks;

class Solution {
    public int countAsterisks(String s) {
        int bar=0;
        int count=0;
        for(char c : s.toCharArray())
        {
            if(c=='|')
                bar++;
            else{
                if(bar%2==0 && c=='*')
                {
                    count++;
                }
            }
        }

        return count;

    }
}