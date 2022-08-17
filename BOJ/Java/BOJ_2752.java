import java.util.Arrays;
import java.util.Scanner;
// Arrays의 정렬 기능과 StringBuilder의 기능 이용
public class BOJ_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++ )
            arr[i]= sc.nextInt();
        Arrays.sort(arr);
        for (int x : arr){
            sb.append(x+" ");
        }
        System.out.println(sb);
    }
}
