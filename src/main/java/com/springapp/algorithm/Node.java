package com.springapp.algorithm;

/**
 * 树节点
 * Created by zhouzhenjiang on 2016/8/30.
 */
public class Node {

    private Name element;

    /**
     * 左节点
     */
    private Node left;

    /**
     * 右节点
     */
    private Node right;

    public Node() {
    }

    public Node(Name element) {
        this.element = element;
    }

    public Name getElement() {
        return element;
    }

    public void setElement(Name element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Note{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}


