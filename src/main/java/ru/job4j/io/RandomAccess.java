package ru.job4j.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccess = new RandomAccessFile("data/random.txt", "rw");
            randomAccess.writeInt(100);
            randomAccess.writeChar('A');
            randomAccess.writeBoolean(true);
            randomAccess.seek(0);
            System.out.println(randomAccess.readInt());
            System.out.println(randomAccess.readChar());
            System.out.println(randomAccess.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
