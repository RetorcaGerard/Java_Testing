import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
         while(true){
            System.out.println("Enter the elements (Put comma ',' between each elements: )");
            String input = ins.nextLine();
            String[]elements = input.split(",");
            int n = elements.length;
            int[]arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(elements[i].trim());
            }

            for (int i = 1 ; i < n ; i++){
                int key = arr[i];
                int j = i - 1;

                while (j >=0 && arr [j]>key){
                    arr [j+1] = arr [j];
                    j--;
                }

                arr[j+1] = key;

                System.out.print("Loop "+ i + ": ");
                for ( int k = 0 ; k < n ; k++){
                    System.out.print(arr [k]+ " ");
                }
                System.out.println();
            }

            System.out.println("Do you want to do bubble sort again? Y/N");
            String pick = ins.nextLine();
            if (pick.equals("Y")){
                continue;
            }else if (pick.equals("N")){
                ins.close();
                return;
            }
         }
    }
}
