package assignments;
import java.util.Scanner;
import java.util.Arrays;

public class arrayoperations {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		int size = 0;
		int choice;
		
		do {
			
			System.out.println("1.insert element");
			System.out.println("2.Delete element");
			System.out.println("3.Linear search");
			System.out.println("4.binary search");
			System.out.println("5.find maximum");
			System.out.println("6.count even & odd");
			System.out.println("7.insertion sort");
			System.out.println("8.display array");
			System.out.println("0.exit");
			System.out.println("enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
                System.out.print("Enter element to insert: ");
                arr[size] = sc.nextInt();
                size++;
                break;

            case 2:
                System.out.print("Enter index to delete: ");
                int index = sc.nextInt();
                for (int i = index; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
                break;

            case 3:
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    if (arr[i] == key) {
                        System.out.println("Found at index " + i);
                        found = true;
                        break;
                    }
                }
                if (!found)
                    System.out.println("Element not found");
                break;

            case 4:
                Arrays.sort(arr, 0, size);
                System.out.print("Enter element to search: ");
                key = sc.nextInt();
                int result = Arrays.binarySearch(arr, 0, size, key);
                if (result >= 0)
                    System.out.println("Found at index " + result);
                else
                    System.out.println("Not found");
                break;

            case 5:
                int max = arr[0];
                for (int i = 1; i < size; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                }
                System.out.println("Maximum value: " + max);
                break;

            case 6:
                int even = 0, odd = 0;
                for (int i = 0; i < size; i++) {
                    if (arr[i] % 2 == 0)
                        even++;
                    else
                        odd++;
                }
                System.out.println("Even count: " + even);
                System.out.println("Odd count: " + odd);
                break;

            case 7:
                for (int i = 1; i < size; i++) {
                    int temp = arr[i];
                    int j = i - 1;
                    while (j >= 0 && arr[j] > temp) {
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = temp;
                }
                System.out.println("Array sorted using Insertion Sort");
                break;

            case 8:
                System.out.println("Array elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 0:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice");
        }

    } while (choice != 0);

    sc.close();
}
}
		



