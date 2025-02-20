import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj1932_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n= Integer.parseInt(br.readLine()),maxCount=0;
        ArrayList<Time> timeList=new ArrayList<>();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            timeList.add(new Time(start,end));
        }
        Collections.sort(timeList);
        int endTime=0;
        for(Time dis:timeList){
            if(dis.start>=endTime){
                maxCount++;
                endTime=dis.end;
            }
        }
        System.out.println(maxCount);
    }
}
class Time implements Comparable<Time>{
    public int start,end;
    public Time(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public int compareTo(Time o) {
        if(this.end==o.end){
            return this.start-o.start;
        }
        return this.end-o.end;
    }
}
