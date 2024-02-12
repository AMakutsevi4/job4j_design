package ru.job4j.array;

public class DeleteNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public void deleteNode(ListNode node) {
//Данный связанный список будет иметь как минимум два элемента
//Все значения узлов будут уникальными.
//Данный узел не будет последним
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        temp.next = null; //разрывает все ссылки из переданного узла.
    }
}
