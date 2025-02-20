import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[][] time=new int[n][2];
        StringTokenizer st;
        // 입력
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            time[i][0]=Integer.parseInt(st.nextToken());
            time[i][1]=Integer.parseInt(st.nextToken());
        }
        // 출력: 입력 확인
        /*for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(time[i]));
        }*/
        Arrays.sort(time,(o1,o2)-> {
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];
            }
            return o1[1]-o2[1];
        });
        // 출력: 정렬 확인
        /*for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(time[i]));
        }*/
        int count=0;
        int end=0;
        for(int i=0;i<n;i++){
            if(end<=time[i][0]){
                end=time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
