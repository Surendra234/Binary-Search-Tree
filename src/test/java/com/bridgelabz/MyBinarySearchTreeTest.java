package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.PresentationDirection;
import java.lang.management.MemoryUsage;
import java.util.TreeMap;

public class MyBinarySearchTreeTest {
    @Test
    public void given3NumbersWhenAddedToBSTShouldReturnSize3() {

        MyBinaryTree myBinaryTree = new MyBinaryTree();

        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);

        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13,size);

        boolean trueResult = myBinaryTree.search(63);
        System.out.println(trueResult);
        Assertions.assertTrue(trueResult);

        boolean falseResult = myBinaryTree.search(120);
        System.out.println(falseResult);
        Assertions.assertFalse(falseResult);
    }
}