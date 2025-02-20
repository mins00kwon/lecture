import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] stairs=new int[n+1];
        // region 입력
        for(int i=1;i<=n;i++){
            stairs[i]=Integer.parseInt(br.readLine());
        }
        // endregion
        // region 입력 확인: 출력
        /*System.out.println(Arrays.toString(stairs));*/
        // endregion
        // 한번에 한 계단 또는 두 계단
        // 연속된 세 개의 계단을 밟으면 안됨
        // 도착 계단은 반드시 밟아야 함
        /* 설명: 이차원 배열을 만들어서
            전 계단을 밟은 값을 0번째 칸에,
            밟지 않은 값을 1번째 칸에 담자
        */
        int[][] dp=new int[n+1][2];
        for(int i=2;i<n;i++){
            // 현재 계단을 밟으려면 전 계단을 밟고 전전 계단을 안밟았거나 전 계단을 밟지 않음
            // 전 계단을 밟고 전전 계단을 밟지 않은 경우
            // 현재 계단을 밟는 경우
                // 전전 계단을 밟지 않고 전 계단을 밟을 수도 있고
                // 전전 계단을 밟고 전 계단을 밟지 않을 수도 있음
            dp[i][0]=stairs[i]+Math.max(dp[i-2][1]+stairs[i-1]  // 전전 계단을 밟지 않고 전 계단을 밟음
                    ,dp[i-1][1]);                               // 전 계단을 밟지 않음.
            dp[i][1]=dp[i-2][0]+stairs[i-1];                    // 전전 계단을 밟고 전 계단을 밟음
        }
        System.out.println(dp[n][0]);
    }
}
