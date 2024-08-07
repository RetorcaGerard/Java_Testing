import java.util.*;

public class bubble {

    public static void main(String[] args) {
        Scanner bub = new Scanner(System.in);

        
         while(true){
            System.out.println("Enter the elements (Put comma ',' between each elements: )");
            String input = bub.nextLine();
            String[]elements = input.split(",");
            int n = elements.length;
            int[]arr = new int[n];

             
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(elements[i].trim());
            }

             
            boolean sorted = false;
            int pass = 0;

            while(!sorted) {
                sorted = true;
                for (int i = 0 ; i < n - 1 - pass; i++) {
                    if (arr [i] > arr [i+1]){
                        int temp = arr [i];
                        arr [i] = arr [i+1];
                        arr [i+1] = temp;
                        sorted = false;
                    }
                }
                
                pass++;

                System.out.print("Loop "+ pass + ": ");
                for ( int i = 0 ; i < n ; i++){
                    System.out.print(arr [i]+ " ");
                }
                System.out.println();
            }

            System.out.println("Do you want to do bubble sort again? Y/N");
            String pick = bub.nextLine();
            if (pick.equals("Y")){
                continue;
            }else if (pick.equals("N")){
                bub.close();
                return;
            }
         }
    }
    
}
