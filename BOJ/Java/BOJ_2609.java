import java.util.Scanner;
/*
최대공약수 및 최소공배수
유클리드 호제법 구현
 */
public class BOJ_2609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large = input.nextInt();
        int small = input.nextInt();
        int gcd = 1, lcm = large*small ;
        if (large<small){
            int swap = large ;
            large = small ;
            small = swap ;
        }
        while(small >= 1){
            int R = large % small ;
            large = small ;
            small = R;
        }
        gcd = large ;
        lcm /= gcd ;
        System.out.println(gcd);
        System.out.println(lcm);
    }

}
