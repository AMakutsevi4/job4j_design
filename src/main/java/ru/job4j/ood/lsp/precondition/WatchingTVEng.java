package ru.job4j.ood.lsp.precondition;

/**
 * Данный класс нарушает принцип LSP тем,что меняет логику проверки входного параметра,
 * и будет выбрасывать исключение, которое никто не ждет.
 */

public class WatchingTVEng extends WatchingTV {

    public void watch(TV tv) {
        if (tv.getChannel() == currentChannel) {
            throw new IllegalArgumentException("Канал недоступен");
        }
    }
}
