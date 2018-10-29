import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        while ((n = s.nextInt()) != 0) {
            int[] vetor = new int[n];
            for (int i = 0; i < n; i++) {
                vetor[i] = s.nextInt();
            }

            int swaps = mergeSort(vetor, n);

            if (swaps % 2 == 0) {
                System.out.println("Carlos");
            } else {
                System.out.println("Marcelo");
            }

        }

    }

    static int mergeSort(int arr[], int array_size) {
        int temp[] = new int[array_size];
        return _mergeSort(arr, temp, 0, array_size - 1);
    }

    static int _mergeSort(int arr[], int temp[], int left, int right) {
        int mid, count = 0;
        if (right > left) {

            mid = (right + left) / 2;

            count = _mergeSort(arr, temp, left, mid);
            count += _mergeSort(arr, temp, mid + 1, right);

            count += merge(arr, temp, left, mid + 1, right);
        }
        return count;
    }

    static int merge(int arr[], int temp[], int left, int mid, int right) {
        int i = left, j = mid, k = left;
        int count = 0;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                count = count + (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}