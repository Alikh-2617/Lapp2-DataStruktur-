package com.comany;
/*
Islam Mohamed
Eiddom Micael
Ali Khawari
*/
public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(3);
        bt.insert(6);
        bt.insert(65);
        bt.insert(11);
        bt.insert(5);
        bt.insert(1);


        System.out.println("In Order : ");
        bt.printInOrder(bt.root);
        System.out.println("In Post Order : ");
        bt.printInPostOrder(bt.root);
        System.out.println("In Pre Order : ");
        bt.printInPreOrder(bt.root);
        System.out.println("In Reverse Order : ");
        bt.printInReverseOrder(bt.root);
    }
}
