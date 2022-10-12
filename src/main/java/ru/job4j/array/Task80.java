package ru.job4j.array;

public class Task80 {
    public static int[] array(int[] nums) {
        //*Подсчитываем и добавляем в массив все элементы которые встречаются в массиве 1 раз*/
        int count = 0;
        int[] rsl = new int[nums.length];
        for (int num = 0; num < nums.length; num++) {
            int k = 0;
            for (int i : nums) {
                if (nums[num] == i) {
                    k++;
                }
            }
            if (k == 1) {
                rsl[count++] = num;
            }
        }

        //*Определяем сколько в отсортированном массиве не пустых значений*/
        int sizeArray = 0;
        int index = 0;

        for (int x = rsl.length; x > 1; x--) {
            if (rsl[x - 1] != 0) {
                sizeArray++;
            }
        }
//* Создаем новый массив с точным размером и добавляем туда все индексы согласно условия*/
        int[] test = new int[sizeArray + 1];
        for (int p = 0; p <= sizeArray; p++) {
            test[index] = rsl[p];
            index++;
        }
        return test;
    }
}