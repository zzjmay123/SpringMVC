package com.springapp.algorithm;

/**
 * 二叉排序树
 * Created by zhouzhenjiang on 2016/8/30.
 */
public class BinarySearchTree {

    private Node root;

    /**
     * 节点的个数
     */
    private int size;

    public BinarySearchTree(Node root) {
        this.root = root;
        size++;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /*****************开始实现对应的CRUD*******************/

    public boolean contains(Name element){
        return contains(element,this.root);
    }

    /**
     * 判断当前是否存在  递归的方式
     * @param element
     * @param note
     * @return
     */
    public boolean contains(Name element,Node root){

        if(root == null ){
            return false;
        }

        int result = element.compareTo(root.getElement());

        if(result > 0){
            //再去查找右子树
            if(root.getRight()!=null){
                return contains(element,root.getRight());
            }else{
                return false;
            }
        }else if(result < 0){
            //去查左子树
            if(root.getLeft()!=null){
                return contains(element,root.getLeft());
            }else{
                return  false;
            }
        }else{
            //默认就是根节点
            return true;
        }

    }

    public boolean insert(Name n){
        return insert(n,this.root);
    }

    /**
     * 插入方法
     * 先判断是否存在于整个树中
     * 不存在的话，在进行插入
     * @param n
     * @param root
     * @return
     */
    public boolean insert(Name n,Node root){

        if(contains(n)){
            //已经存在不插入
            return false;
        }

        //判断根节点是否存在
        if(root == null){
            //直接创建
            this.root = new Node(n);
            return true;
        }else if(n.compareTo(root.getElement())>0){
            //插入右子树
            if(root.getRight()!=null) {
                return insert(n, root.getRight());
            }else{
                root.setRight(new Node(n));
                return  true;
            }
        }else if(n.compareTo(root.getElement())<0){
            if(root.getLeft()!=null) {
                return insert(n, root.getLeft());

            }else{
                root.setLeft(new Node(n));
                return true;
            }
        }else{
            return false;
        }

    }

    /**
     * 移除节点
     * @param n
     * @param root
     * @return
     */
    public Node remove(Name n,Node root){
        int result = n.compareTo(root.getElement());

        if(result >0){
            if(root.getRight() !=null){
                return remove(n,root.getRight());
            }else{
                return null;
            }
        }else if(result <0){
            if(root.getLeft() !=null){
                return remove(n,root.getLeft());
            }else{
                return null;
            }
        }else{
            //比较特殊的情况，首先需要判断节点的类型
            //1.是叶子节点的话，则直接删除移除
            //2.不是叶子节点，只有左子树，或者右子树的，直接子继承父的地位
            //3.如果同时存在左子树和右子树的情况，找到左子树的最大节点，进行替换
            if(root.getLeft()==null && root.getRight()==null){
                root =null;  //直接置为null，会被jvm虚拟机垃圾回收
            }else if(root.getLeft() != null && root.getRight() ==null){
                root = root.getLeft();
            }else if(root.getLeft() == null && root.getRight() !=null){
                root = root.getRight();
            }else{
                //左，右都存在的情况
                //找前驱节点
                Node newRoot = root.getLeft();
                while (newRoot.getRight() != null){
                    newRoot = root.getRight();  //知道没有右子树
                }
                root.setElement(newRoot.getElement());//直接找到数值替换

                root.setLeft(remove(root.getElement(),root.getLeft()));//直接删除通元素的节点

            }
        }

        return root;
    }




}
