import java.util.Scanner;
// 나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부.
// 그 외에는 모두 청소년부.
// 마지막 줄은 # 0 0
public class BOJ_2083 {
    public static void main(String[] args) {
        int age, weight;
        String name ;
        Scanner sc = new Scanner(System.in);
        while (true){
            name = sc.next();
            age = sc.nextInt();
            weight = sc.nextInt();
            if (age+weight == 0 && name.equals("#")) break;
            if (age > 17 || weight >= 80) {
                System.out.printf("%s Senior%n", name);
            } else {
                System.out.printf("%s Junior%n", name);
            }
        }
    }
}
