package ru.job4j.gc.ref;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * пример работы мягких ссылок
 */
public class SoftDemo {

    public static void main(String[] args) {
        System.out.println("example1");
        example1();
        System.out.println("example2");
        example2();
        System.out.println("unsafe");
        unsafe();
        System.out.println("safe");
        safe();
    }

    private static void example1() {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;
        System.out.println(soft.get());
    }

    private static void example2() {
        List<SoftReference<Object>> objects = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            objects.add(new SoftReference<Object>(new Object() {
                String value = String.valueOf(System.currentTimeMillis());

                @Override
                protected void finalize() throws Throwable {
                    System.out.println("Object removed!");
                }
            }));
        }
        System.gc();
        int liveObject = 0;
        for (SoftReference<Object> ref : objects) {
            Object object = ref.get();
            if (object != null) {
                liveObject++;
            }
        }
        System.out.println(liveObject);
    }

    private static void unsafe() {
        List<SoftReference<Object>> someData = new ArrayList<>();
        someData.add(new SoftReference<>(new Object()));
        if (someData.get(0).get() != null) {
            System.out.println("someData != null");
        } else {
            System.out.println("someData == null");
        }
        Object object = someData.get(0).get();
    }

    private static void safe() {
        List<SoftReference<Object>> someData = new ArrayList<>();
        someData.add(new SoftReference<>(new Object()));
        Object strong = someData.get(0).get();
        if (strong != null) {
            System.out.println("strong != null");
        } else {
            System.out.println("strong == null");
        }
        Object object = strong;
    }
}