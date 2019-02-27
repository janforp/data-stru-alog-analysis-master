package com.janita.chapter4.binarytree;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author janita
 * @since 2018/9/2 - 下午5:03
 * 类说明：
 */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    private static class BinaryNode<AnyType> {

        AnyType element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;

        BinaryNode(AnyType theElement) {

            this(theElement, null, null);
        }

        BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {

            element = theElement;
            left = lt;
            right = rt;
        }
    }

    private BinaryNode<AnyType> root;

    public BinarySearchTree() {

        root = null;
    }

    public void makeEmpty() {

        root = null;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean contains(AnyType x) {

        return contains(x, root);
    }

    public AnyType findMin() {

        if (isEmpty()) {
            throw new RuntimeException();
        }

        return findMin(root).element;
    }

    //TODO
    public BinaryNode<AnyType> findMin(BinaryNode<AnyType> node) {

        if (node == null) {

            return null;
        }else if (node.left == null) {
            return node;
        }

        return findMin(node.left);
    }

    public AnyType findMax() {

        if (isEmpty()) {
            throw new RuntimeException();
        }

        return findMax(root).element;
    }

    //TODO
    public BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {

        while (t != null) {

            while (t.right != null) {
                t = t.right;
            }
        }
        return t;
    }

    public void insert(AnyType x) {

        insert(x, root);
    }

    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {

        if (t == null) {

            return new BinaryNode<>(x, null, null);
        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0) {

            t.left = insert(x, t.left);

        }else if (compareResult > 0) {

            t.right = insert(x, t.right);

        }else {

            //重复元素什么都不做
        }
        return t;
    }

    //TODO
    public void remove(AnyType x) {


    }

    public boolean contains(AnyType x, BinaryNode<AnyType> t) {

        if (t == null) {
            return false;
        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0) {

            return contains(x, t.left);
        }else if (compareResult > 0) {

            return contains(x, t.right);
        }else {

            return true;
        }
    }

    private static boolean oneCharOff(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int diffs = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (++ diffs > 1) {
                    return false;
                }
            }
        }
        return diffs == 1;
    }

    public static void main(String[] args) {
        AtomicInteger d = new AtomicInteger();
    }

    public static void pringHighChangeables(Map<String, List<String>> adjWords, int minWords) {
        for (Map.Entry<String, List<String>> entry : adjWords.entrySet()) {
            List<String> words = entry.getValue();
            if (words.size() >= minWords) {
                System.out.println(entry.getKey() + "(");
                System.out.println(words.size() + "):");
                for (String word : words) {
                    System.out.println(" " + word);
                }
                System.out.println();
            }
        }
    }

    private static <KeyType> void update(Map<KeyType, List<String>> m, KeyType key, String value) {
        List<String> lst = m.computeIfAbsent(key, k -> new ArrayList<>());
        lst.add(value);
    }

    public static Map<String, List<String>> computeAdjacentWords(List<String> theWords) {
        Map<String, List<String>> adjWords = new TreeMap<>();
        String[] words = new String[theWords.size()];
        theWords.toArray(words);
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (oneCharOff(words[i], words[j])) {
                    update(adjWords, words[i], words[j]);
                    update(adjWords, words[j], words[i]);
                }
            }
        }
        return adjWords;
    }

    public static int hash(String key, int tableSize) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal += key.charAt(i);
        }
        return hashVal % tableSize;
    }
}
