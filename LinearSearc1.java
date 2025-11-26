import java.util.Scanner;

public class LinearSearc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the nummber of array elements: ");
        int n = input.nextInt ();
        int[] arrayInt = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = input.nextInt();
        }
            

        System.out.print("Enter the key you want to search for: ");
        int key = input.nextInt();


        int result = -1;
        for (int i = 0; 1 < arrayInt.length; i++) {
            if (arrayInt[1] == key) {
                result = 1;
                break;
            }
        }


    if (result != -1) {
        System.out.println("The key in the array is located at index postion " + result);
    } else {
        System.out.println("key not found");
    }

    input.close();

    }
}
/*
1.Explain the meaning of the break; statement on line 13 of the program code in
Experiment 4.
is use inside a for loop to immediately exit the loop once the key is found
2.Modify the program code in experiment 4 so that the program can receive input
in the form of the number of array elements, the contens of the array, and the
positions of the searched key.
done
3.Modify the program in experiment 4 so that the program will give the message
"key not found" if the key is not in the array"
Done







*/