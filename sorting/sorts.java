import java.util.*;

abstract class sort {
    public abstract void insertion();
    public abstract void selection();
    public abstract void bubble();
}

class sot extends sort {
    Scanner sc = new Scanner(System.in);

    public void bubble(){

        while(true){
            System.out.println("Enter the elements (Put comma ',' between each elements: )");
            String input = sc.nextLine();
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
            String pick = sc.nextLine();
            if (pick.equals("Y")){
                continue;
            }else if (pick.equals("N")){
                return;
            }
        }
    }

    public void insertion(){
        while(true){
            System.out.println("Enter the elements (Put comma ',' between each elements: )");
            String input = sc.nextLine();
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
            String pick = sc.nextLine();
            if (pick.equals("Y")){
                continue;
            }else if (pick.equals("N")){
                return;
            }
         }
    }

    public void selection(){
        while(true){
            System.out.println("Enter the elements [Put comma(,) between each elements:]");
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
                    if (arr[j] < arr[minIndex]){
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
                return;
            }
        } 
    }
}


public class sorts {
    public static void main(String[] args) {
        Scanner options = new Scanner(System.in);

        sot source = new sot();
        while(true){
            System.out.println("Choose your sorts: bubble, selection, insertion");
            String sets = options.nextLine();
            if (sets.equals("bubble")){
            source.bubble();
            } else if (sets.equals("selection")){
            source.selection();
            } else if (sets.equals("insertion")){
                source.insertion();
            } else {
            options.close();
            }

        }
    }
}
