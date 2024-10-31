import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        String[] listStrings;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many Word do you want to sort? ");
        size = scan.nextInt();
        listStrings = new String[size];

        System.out.println("\nEnter the word");
        for (int i = 0 ; i <size; i++){
            listStrings[i] = scan.nextLine(); 
        }
        
        Sorting.selectionSort(listStrings);
        
        System.out.println("/nYour Words in sorted order...");
        for (int i = 0; i <size; i++){
            System.out.println(listStrings[i] + " ");
        System.out.println();
        }
    
    }
}