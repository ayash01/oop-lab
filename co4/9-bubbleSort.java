import java.util.Scanner;

class BubbleSort<T extends Comparable<T>> {
    private final T[] items;

    public BubbleSort(T[] items) {
        this.items = items;
    }

    public void bubbleSort() {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}

class BubbleSortDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        Integer[] array = new Integer[input.nextInt()];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Unsorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        BubbleSort<Integer> bubbleSort = new BubbleSort<>(array);
        bubbleSort.bubbleSort();

        System.out.println("\nSorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        input.close();
    }
}