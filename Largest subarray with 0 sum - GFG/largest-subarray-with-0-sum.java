// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       int preSum=0;
       int i=-1;
       int ans=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,0);
       for( i=0;i<n;i++)
       {
           preSum+=arr[i];
           if(map.containsKey(preSum))
           {
               ans=Math.max(ans,i+1-map.get(preSum));
           }else
           {
               map.put(preSum,i+1);
           }
       }
       return ans;
    }
}