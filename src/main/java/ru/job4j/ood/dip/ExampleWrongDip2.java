package ru.job4j.ood.dip;

public class ExampleWrongDip2 {

    /**
     * Данный пример нарушает принцип DIP тем,
     * что класс Client полностью зависит от класса Server.
     * Решение: нужно использовать прослойку между зависимостей в виде интерфейса.
     */

    class Server {
        void execute() {
            System.out.println("Connect");
        }
    }

    class Client {
        Server server = new Server();
        void doJob() {
            server.execute();
        }
    }
}
