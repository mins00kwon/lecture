import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input= Integer.parseInt(br.readLine());
        int[][] dp=new int[input+1][2];
        if(input>=3) {
            dp[3][0] = 1;
        }
        if(input>=5) {
            dp[5][1] = 1;
        }
        for(int i=6;i<=input;i++){
            if(dp[i-5][1]!=0){
                if(i%5==0){
                    dp[i][0] = 0;
                    dp[i][1] = i/5;
                    continue;
                }
                else{
                    dp[i][1] = dp[i-5][1]+1;
                }
            }
            if(dp[i-3][0]!=0){
                dp[i][0] = dp[i-3][0]+1;
                dp[i][1] = dp[i-3][1];
            }

        }
        int result=dp[input][0]+dp[input][1];
        System.out.println((result!=0)?result:-1);
    }
}
