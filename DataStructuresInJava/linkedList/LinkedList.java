package DataStructuresInJava.linkedList;
import java.util.*;
public class LinkedList <K extends Comparable<K>,V> {
	private Node root;
    
	private class Node {
		private K key;
		private V value;
		private Node prev, next;

		Node(K key, V value, Node prev, Node next) {
			this.key = key;
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
}
