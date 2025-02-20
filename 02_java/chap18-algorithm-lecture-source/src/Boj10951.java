import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int[] arr=new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=i;
        }
        for(int i=1;i<=K;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            reverse(arr,start,end);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=N;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }

    private static void reverse(int[] arr, int start, int end) {
        int[] origin=arr.clone();
        int diff=end-start;
        for(int i=0;i<=diff;i++){
            arr[start+i]=origin[end-i];
        }
    }
}
