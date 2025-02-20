import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int count=0;
        for (int i = 1; i <= 10; i++) {
            int input=Integer.parseInt(br.readLine())%42;
            if(set.contains(input)) {
                continue;
            }else{
                set.add(input);
                count++;
            }
        }
        System.out.println(count);
    }
}