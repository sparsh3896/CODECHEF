import java.util.Scanner;

class chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int v1 = sc.nextInt();
        int d2 = sc.nextInt();
        int v2 = sc.nextInt();
        int p = sc.nextInt();

        int sum = 0, c = 0, got = 0;

        if (d1 < d2) {
            for (int i = d1; i < d2; i++) {
                sum += v1;
                c++;

                if (sum >= p) {
                    got = 1;
                    break;
                }
            }
            if (got == 0) {
                while (sum < p)
                {
                    sum = sum + v1 + v2;
                    c++;
                }
            }
            c = c + (d1 - 1);
        } else if (d1 > d2) {
            c = 0;
            sum = 0;
            got = 0;

            for (int i = d2; i < d1; i++) {
                sum += v2;
                c++;

                if (sum >= p) {
                    got = 1;
                    break;
                }
            }
            if (got == 0) {
                while (sum < p) {
                    sum = sum + v1 + v2;
                    c++;
                }
            }
            c = c + (d2 - 1);
        } else {
            c = 0;
            sum = 0;
            got = 0;

            if (p % (v1 + v2) == 0) {
                c = p / (v1 + v2);
            } else
                c = p / (v1 + v2) + 1;

            c = c + (d1 - 1);
        }

        System.out.println(c);
    }
}
