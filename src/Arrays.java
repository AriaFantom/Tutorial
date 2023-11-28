public class Arrays {
    public static void main(String[] args) {
                   // 0  1  2  3  4  5
        int[] num = { 1, 4, 6, 4, 5, 10 };

        for (int i = 0; i <= 5; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

    }
}
