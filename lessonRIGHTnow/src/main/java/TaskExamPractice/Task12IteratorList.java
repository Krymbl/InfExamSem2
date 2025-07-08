package TaskExamPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class Task12IteratorList {
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

        LinkIteraor link = new LinkIteraor(node1);

        for (Node node : link) {
            System.out.println(node.item);
        }

    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element) {
            this.item = element;
        }
    }

    public static class LinkIteraor implements Iterable<Node> {
        private Node currentNode;

        public LinkIteraor(Node currentNode) {
            this.currentNode = currentNode;
        }

        public Iterator<Node> iterator() {
            return new MyLinkIterator();
        }

        public class MyLinkIterator implements Iterator<Node> {


            public boolean hasNext() {
                return currentNode!=null;
            }

            public Node next() {
                Node temp = currentNode;
                currentNode = currentNode.next;
                return temp;
            }
        }
    }
}
