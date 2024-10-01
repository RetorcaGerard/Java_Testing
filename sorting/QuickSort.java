import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr);
        scanner.close();
    }

    static void quickSort(int[] arr) {
        int[] stack = new int[arr.length];
        int top = -1;
        stack[++top] = 0;
        stack[++top] = arr.length - 1;

        while (top >= 0) {
            int end = stack[top--];
            int start = stack[top--];
            if (start >= end) continue;
            int pivot = arr[start];
            int low = start + 1;
            int high = end;

            while (true) {
                while (low <= high && arr[high] >= pivot) high--;
                while (low <= high && arr[low] <= pivot) low++;
                if (low <= high) {
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                } else {
                    break;
                }
            }
            arr[start] = arr[high];
            arr[high] = pivot;
            stack[++top] = start;
            stack[++top] = high - 1;
            stack[++top] = high + 1;
            stack[++top] = end;
        }
    }
}
