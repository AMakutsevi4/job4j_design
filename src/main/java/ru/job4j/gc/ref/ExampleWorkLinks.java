package ru.job4j.gc.ref;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ExampleWorkLinks {

    public static void main(String[] args) {
        strongReference();
        softReference();
        weakReference();
    }

    private static void strongReference() {
        Employee emp = new Employee(100, "Alex"); /** сильная ссылка */
        emp = null; /** теперь сборщик мусора имеет право удалить объект */
    }

    private static void softReference() {
        Employee emp = new Employee(100, "Alex");
        SoftReference<Employee> softReference = new SoftReference<>(emp);
        System.out.println(softReference.get());
        emp = null;
        System.gc();
        System.out.println(softReference.get()); /** объект будет удален если не будет хватать места */
    }

    private static void weakReference() {
        Employee emp = new Employee(100, "Alex");
        WeakReference<Employee> weakReference = new WeakReference<>(emp);
        System.out.println(weakReference.get());
        emp = null;
        System.gc();
        System.out.println(weakReference.get()); /** объект будет удален при первом сборщике мусора */
    }
}