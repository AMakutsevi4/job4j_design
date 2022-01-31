package ru.job4j.ood.lsp.precondition;

public class WatchingTV {

    protected int currentChannel = 1;

    public void watch(TV tv) {
        if (tv.getChannel() == currentChannel) {
            System.out.println("Канал недоступен");
        }
    }
}
