package com.janita.chapter4.binarytree;

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
}
