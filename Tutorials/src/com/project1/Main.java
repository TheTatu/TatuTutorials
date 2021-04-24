package com.project1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int i, count = 0, size, temp, loc, val, j;
		int Arr[] = new int[20];
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("What do You want to do\n");
			System.out.println(
					"1.Array Linear search\n2.Array Binary search\n3.Array Sorting(Bubble sort)\n4.Insert element at beginning\n5.Insert element at end\n6.Insert element at any position\n7.Delete beginning element\n8.Delete end element\n9.Delete element from any position\n10.Exit\n ");
			System.out.println("Enter Your Choice\n");
			int choice = input.nextInt();
			if (choice == 10) {
				System.exit(0);
			} else if (choice > 10 || choice <= 0) {
				System.out.println("Wrong Input!");
				continue;
			} else

				System.out.println("How Many Elemnts You Want in Array");
			size = input.nextInt();
			System.out.println("Enter The Elements in Array");
			for (i = 0; i < size; i++) {
				Arr[i] = input.nextInt();
			}
			System.out.println("The Elements of Array are:");
			for (i = 0; i < size; i++) {
				System.out.println(Arr[i]);
			}

			switch (choice) {
			case 1:
				System.out.println("Enter The Element to search in Given Array");
				val = input.nextInt();
				for (i = 0; i < size; i++) {
					if (Arr[i] == val) {
						count++;
					}
				}
				if (count != 0) {
					System.out.println("The " + val + " is Present " + count + " times\n");
				} else {
					System.out.println("The Element " + val + " Not found In the given Array\n");
				}
				break;

			case 2:
				for (j = 0; j < size - 1; j++) {
					for (i = 0; i < size - j - 1; i++) {
						if (Arr[i] >= Arr[i + 1]) {
							temp = Arr[i];
							Arr[i] = Arr[i + 1];
							Arr[i + 1] = temp;
						}
					}
				}
				System.out.println("Your Sorted Array is");
				for (i = 0; i < size; i++) {
					System.out.println(Arr[i]);
				}
				System.out.println("Enter The Element to search in Given Array");
				val = input.nextInt();
				int mid = ((size - 1) / 2);
				if (val == Arr[mid]) {
					count++;
				}

				else if (val > Arr[mid]) {
					for (i = (mid); i < size; i++) {
						if (Arr[i] == val) {
							count++;
						}
					}
				} else {
					for (i = 0; i < (mid); i++) {
						if (Arr[i] == val) {
							count++;
						}
					}

				}
				if (count != 0) {
					System.out.println("The " + val + " is Present " + count + " times\n");
				} else {
					System.out.println("The Element " + val + "Not found In the given Array\n");
				}
				break;

			case 3:
				for (j = 0; j < size - 1; j++) {
					for (i = 0; i < size - j - 1; i++) {
						if (Arr[i] >= Arr[i + 1]) {
							temp = Arr[i];
							Arr[i] = Arr[i + 1];
							Arr[i + 1] = temp;
						}
					}

				}
				System.out.println("Your Sorted Array is");
				for (i = 0; i < size; i++) {
					System.out.println(Arr[i]);
				}
				break;

			case 4:
				if (size == 20) {
					System.out.println("Array is Full can't insert elements");
				} else {
					System.out.println("Enter the element to insert in beginning of Array\n");
					val = input.nextInt();

					for (i = size - 1; i >= 0; i--) {
						Arr[i + 1] = Arr[i];
					}
					Arr[0] = val;
					System.out.println("Insertion Done at beginning");
					size++;
					System.out.println("The Elements of Array are:");
					for (i = 0; i < size; i++) {
						System.out.println(Arr[i]);
					}

				}
				break;
			case 5:
				if (size == 20) {
					System.out.println("Array is Full can't insert elements");
				} else {
					System.out.println("Enter the element to insert in end of Array\n");
					val = input.nextInt();
					Arr[size] = val;
					size++;
					System.out.println("Insertion Done at end");
					System.out.println("The Elements of Array are:");
					for (i = 0; i < size; i++) {
						System.out.println(Arr[i]);
					}

				}
				break;
			case 6:
				if (size == 20) {
					System.out.println("Array is Full can't insert elements");
				} else {
					System.out.println("Enter the element to insert in of Array\n");
					val = input.nextInt();
					System.out.println("Enter the Position to insert element\n");
					loc = input.nextInt();
					for (i = size - 1; i >= loc - 1; i--) {
						Arr[i + 1] = Arr[i];
					}
					Arr[loc - 1] = val;
					size++;
					System.out.println("Insertion Done at Position" + loc);
					System.out.println("The Elements of Array are:");
					for (i = 0; i < size; i++) {
						System.out.println(Arr[i]);
					}

				}
				break;
			case 7:
				for (i = 0; i < size; i++) {
					Arr[i] = Arr[i + 1];
				}
				size--;
				System.out.println("Deletion Done at beginning");
				System.out.println("The Elements of Array are:");
				for (i = 0; i < size; i++) {
					System.out.println(Arr[i]);
				}
				break;
			case 8:
				size--;
				System.out.println("Deletion Done at end");
				for (i = 0; i < size; i++) {
					System.out.println(Arr[i]);
				}
				break;
			case 9:
				System.out.println("Enter the Position to delete element\n");
				loc = input.nextInt();
				for (i = loc - 1; i < size - 1; i++) {
					Arr[i] = Arr[i + 1];
				}
				size--;
				System.out.println("Deletion Done at Position " + loc);
				System.out.println("The Elements of Array are:");
				for (i = 0; i < size; i++) {
					System.out.println(Arr[i]);
				}

				break;
			case 10:
			default:
				System.out.printf("Wrong Input!\nPress Again Thank you!");

			}
		}
	}
}