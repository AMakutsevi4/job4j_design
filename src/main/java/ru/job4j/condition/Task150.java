package ru.job4j.condition;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        boolean flag = true;
        int operations = 0;
        int rsl = account + transfers[operations];
        while (rsl >= 0 && account > overdraft && flag) {
            account += transfers[operations++];
            rsl = account + transfers[operations];
            if (transfers[operations] == 0) {
                flag = false;
            } else if (account == 0) {
                account = overdraft;
                operations++;
                flag = false;
            }
        }
        System.out.printf("Остаток: %d, операций: %d" + System.lineSeparator(), account, operations);
    }
}

