/**
 * Binary Search Tree (BST) Implementation.
 * Covers: Insertion, Search, and In-order Traversal.
 */
public class BST {
    static class Node {
        int key;
        Node left, right;
        Node(int d) { key = d; left = right = null; }
    }

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        if (root.key < key) return searchRec(root.right, key);
        return searchRec(root.left, key);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder traversal: ");
        bst.inorder(); // 20 30 40 50 60 70 80

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));
    }
}
