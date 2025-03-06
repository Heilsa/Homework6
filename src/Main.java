import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] one = new int[3];
        for (int l = 0; l < one.length; l++) {
            one[l] = l + 1;
        }
        System.out.println(Arrays.toString(one));
        float[] two = {1.57f, 7.654f, 9.986f};
        two[0] = 1.57f;
        for (int y = 0; y < two.length; y++) {
            System.out.println(two[y]);
        }
        int three[] = {1, 2, 3, 4, 5, 6, 7};
        three[0] = 1;
        for (int g = 0; g < 7; g++) {
            System.out.println(three[g]);
        }
        System.out.println("Задача 2");
        int[] example = new int[3];
        example[0] = 1;
        example[1] = 2;
        example[2] = 3;
        System.out.print(example[0] + ", ");
        System.out.print(example[1] + ", ");
        System.out.print(example[2]);
        System.out.println();
        float[] example2 = new float[3];
        example2[0] = 1.57f;
        example2[1] = 7.654f;
        example2[2] = 9.986f;
        System.out.print(example2[0] + ", ");
        System.out.print(example2[1] + ", ");
        System.out.print(example2[2]);
        System.out.println();
        System.out.println("Задача 3");
        int[] numbers = {1, 2, 3};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] numbers2 = {1.57f, 7.654f, 9.986f};
        for (int u = numbers2.length - 1; u >= 0; u--) {
            System.out.print(numbers2[u]);
            if (u != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");

        int[] arr = {1, 2, 3};
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] % 2 != 0) {
                arr[n] = arr[n] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}