import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nc = s.nextInt();

        for (int i = 0; i < nc; i++) {
            int qnt = s.nextInt();
            Integer[] students = new Integer[qnt];

            for (int j = 0; j < qnt; j++) {
                students[j] = s.nextInt();
            }
            System.out.println(reorganize(students));
        }
    }

    static int reorganize(Integer[] students) {
        int n = 0;
        Integer[] old = new Integer[students.length];

        System.arraycopy(students, 0, old, 0, students.length);

        Arrays.sort(students, Collections.reverseOrder());

        for (int i = 0; i < students.length; i++) {
            if (Objects.equals(students[i], old[i])) {
                n++;
            }
        }

        return n;
    }
}