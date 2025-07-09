package TaskExamTheory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

// TODO  Предложите, как бы мог быть реализован итератор
//  по односвязному линейному списку,
//  если реализован только класс его елемента Elem(Node). Приведите код.
public class Task12IteratorLinkList {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkIt<Integer> link = new LinkIt(node1);
        for (Integer x : link) {
            System.out.println(x);
        }


    }

    public static class Node<T> {
        public Node<T> next;
        public T value;

        public Node(T value) {
            this.value = value;
        }
    }
    ///ОТВЕТ!!!!!!!!!!!!!!!
    public static class LinkIt<T> implements Iterable<T> {
        Node<T> head;

        public LinkIt(Node<T> node) {
            this.head = node;
        }
        @Override
        public Iterator<T> iterator() {
            return new IteratorLinkdList(head);
        }

        public class IteratorLinkdList implements Iterator<T> {
            Node currentNode;

            public IteratorLinkdList(Node<T> head) {
                this.currentNode = head;
            }
            @Override
            public boolean hasNext() {
                return currentNode!=null;
            }

            @Override
            public T next() {
                if (currentNode==null) {
                    throw new NoSuchElementException();
                }
                T result = (T) currentNode.value;
                currentNode = currentNode.next;
                return result;
            }
        }
    }
    ///КОНЕЦ ОТВЕТ!!!!!!!!!!!!!!!
}
