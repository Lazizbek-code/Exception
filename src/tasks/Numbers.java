package tasks;

import java.util.Scanner;


public class Numbers {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Massivni qiymatlar bilan to'ldirish
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Foydalanuvchi tomonidan son kiritish
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iltimos, 1 dan 10 gacha bir son kiriting: ");
        int userNumber = scanner.nextInt();

        try {
            // Massivdagi sonni topish va ekranga chiqarish
            findAndPrintNumber(array, userNumber);
        } catch (NoFoundNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    // Massivdagi berilgan sonni topib ekranga chiqaruvchi method
    public static void findAndPrintNumber(int[] array, int number) throws NoFoundNumberException {
        for (int i : array) {
            if (i == number) {
                System.out.println("Massivdagi son: " + i);
                return;
            }
        }
        throw new NoFoundNumberException("NoFoundNumberException: Massivda kiritilgan son topilmadi.");
    }
}

class NoFoundNumberException extends Exception {
    public NoFoundNumberException(String message) {
        super(message);
    }
}

