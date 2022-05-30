class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=0;
        int count=0;
        for(int i=0;i<sentences.length;i++)
        {
            count=0;
           for(int j=0;j<sentences[i].length();j++)
           {
               if(sentences[i].charAt(j)==' ')
               {
                   count++;
               }
               maxi=Math.max(maxi,count);
           }
        }
        return maxi+1;
        
    }
}