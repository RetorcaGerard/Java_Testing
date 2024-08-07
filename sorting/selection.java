import java.util.*;
public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while(true){
            System.out.println("Enter the elements (Put comma ',' between each elements: )");
            String input = sc.nextLine();
            String[]elements = input.split(",");
            int n = elements.length;
            int[]arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(elements[i].trim());
            }

            for (int i = 0; i < n - 1 ; i++){
                int minIndex = i;
                for (int j = i + 1; j < n; j++){
                    if (arr[j] < arr(minIndex)){
                        minIndex = j;
                    }
                }

            int temp = arr [i];
            arr [i] = arr[minIndex];
            arr[minIndex] = temp;

                System.out.print("Loop "+ (i+1) + ": ");
                for ( int k = 0 ; k < n ; k++){
                    System.out.print(arr [k]+ " ");
                }
                System.out.println();
            }

            System.out.println("Do you want to do bubble sort again? Y/N");
            String pick = sc.nextLine();
            if (pick.equals("Y")){
                continue;
            }else if (pick.equals("N")){
                sc.close();
                return;
            }
         }
    }
}
