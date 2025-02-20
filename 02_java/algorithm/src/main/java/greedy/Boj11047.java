package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11047 {
    public static void main(String[] args) throws IOException {
        System.out.println("d");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int ans=0, cur=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<=cur){
                ans+=k/arr[i];    // 지금 동전 몇개 쓸건데
                k%=arr[i];
                if(k==0){
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
