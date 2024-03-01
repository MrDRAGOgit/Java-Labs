import java.util.Arrays;
import java.util.Random;

public class insertSort {
    public static void main(String[] args) {
        int N = 100000;
        int[] A;
        A = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            A[i] = random.nextInt(N);
        }
//        System.out.println(Arrays.toString(A));
        int[] B;
        B = A.clone();
        long timeCalc = System.currentTimeMillis();
        for (int i = 1; i < N; i++) {
            int temp = A[i];
            int j = i;
            while (j > 0 && A[j - 1] > temp) {
                A[j] = A[j - 1];
                j = j - 1;
            }
            A[j] = temp;
        }
        System.out.println(System.currentTimeMillis() - timeCalc);
//        System.out.println(Arrays.toString(A));
        timeCalc = System.currentTimeMillis();
        Arrays.sort(B);
        System.out.println(System.currentTimeMillis() - timeCalc);
    }
}