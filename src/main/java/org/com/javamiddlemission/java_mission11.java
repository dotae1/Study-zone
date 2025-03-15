package org.com.javamiddlemission;
import java.util.Scanner;

public class java_mission11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.print(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // 정렬 전 배열 출력
        System.out.println("\n정렬 전 배열:");
        printArray(array);

        // 버블 정렬 실행
        int[] bubbleSortedArray = array.clone(); // 원본 배열 유지
        bubbleSort(bubbleSortedArray);
        System.out.println("\n[ 버블 정렬 결과 ]");
        printArray(bubbleSortedArray);

        // 선택 정렬 실행
        int[] selectionSortedArray = array.clone(); // 원본 배열 유지
        selectionSort(selectionSortedArray);
        System.out.println("\n[ 선택 정렬 결과 ]");
        printArray(selectionSortedArray);

        scanner.close();
    }

    // 버블 정렬 구현
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // 선택 정렬 구현
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    // 두 요소 교환 메서드
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 배열 출력 메서드
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
