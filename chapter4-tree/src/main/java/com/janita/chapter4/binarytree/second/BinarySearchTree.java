package com.janita.chapter4.binarytree.second;

import java.util.Comparator;

/**
 * @author janita
 * @since 2018/9/2 - 下午5:41
 * 类说明：
 */
public class BinarySearchTree<AnyType> {

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

    private Comparator<? super AnyType> cmp;

    public BinarySearchTree() {

        this(null);
    }

    public BinarySearchTree(Comparator<? super AnyType> c) {

        root = null;
        cmp = c;
    }

    private int myCompare(AnyType lhs, AnyType rhs) {

        if (cmp != null) {

            return cmp.compare(lhs, rhs);
        }else {

            return ((Comparable)lhs).compareTo(rhs);
        }
    }

    public boolean contains(AnyType x, BinaryNode<AnyType> t) {

        if (t == null) {

            return false;
        }

        int compareResult = myCompare(x, t.element);

        if (compareResult < 0) {

            return contains(x, t.left);
        }else if (compareResult > 0) {

            return contains(x, t.right);
        }else {

            return true;
        }
    }


}
