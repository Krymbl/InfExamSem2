package TaskExamPractice;

import java.util.Iterator;
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

        LinkIt link = new LinkIt(node1);
        for (Node node : link) {
            System.out.println(node.value);
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
    public static class LinkIt implements Iterable<Node> {
        Node currentNode;

        public LinkIt(Node node) {
            this.currentNode = node;
        }
        @Override
        public Iterator<Node> iterator() {
            return new IteratorLinkdList();
        }

        public class IteratorLinkdList<T> implements Iterator<Node> {
            @Override
            public boolean hasNext() {
                return currentNode!=null;
            }

            @Override
            public Node next() {
                if (currentNode==null) {
                    throw new NoSuchElementException();
                }
                Node result = currentNode;
                currentNode = currentNode.next;
                return result;
            }
        }
    }
    ///КОНЕЦ ОТВЕТ!!!!!!!!!!!!!!!
}
