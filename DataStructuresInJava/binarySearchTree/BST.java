package binarySearchTree;
public class BST<K extends Comparable<K>, V> {
	private Node root;

    public BST() {

    }

    private class Node {
        private K key;
        private V value;
        private Node left, right;
        private int size;

        public Node(K key, V value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }
    // 核心方法
    // 查找 key 对应的 value
    public V get(K key) {
        return get(root,key);
    }
    // 递归版本
    private V get(Node root, K key) {
        // 递归版本的查找方法
//            if (root == null) return null;
//
//            int cmp = key.compareTo(root.key);
//            if (cmp > 0) return get(root.right,key);
//            else if (cmp < 0) return get(root.left, key);
//            else return root.value;

        // 非递归版本的查找方法
        Node curr = root;
        while (curr != null) {
            int cmp = key.compareTo(curr.key);
            if (cmp > 0) curr = curr.right;
            else if (cmp < 0) curr = curr.left;
            else return curr.value;
        }
        return null;
    }


    // 插入一个键值对
    public void put(K key, V value) {
        root = put(root, key, value);
    }
    private Node put(Node root, K key, V value) {

        // 若子树内存在键为 key 的结点，则更新该结点键值为 value
        // 否则将<key, value> 作为一个新结点插入该子树中。
        if (root == null) return new Node(key,value,1);
        int cmp = key.compareTo(root.key);
        if (cmp > 0) root.right =  put(root.right,key,value);
        else if (cmp < 0) root.left = put(root.left, key, value);
        else root.value = value;

        // 更新 size 值
        root.size = size(root.left) + size(root.right) + 1;
        return root;
    }

    public int size() {
        return size(root);
    }
    private int size(Node root) {
        return (root == null) ? 0 : root.size;
    }

    public String toString() {
        return toString(root);
    }
    private String toString(Node root) {
        if (root == null) return "";
        String str = root.value.toString();
        return toString(root.left) + str + toString(root.right);
    }
	public static void main(String[] args) {
        BST<Integer,Integer> bst = new BST<>();
        bst.put(2,2);
        bst.put(1,1);
        bst.put(0,0);
        System.out.println(bst.toString());
    }
}