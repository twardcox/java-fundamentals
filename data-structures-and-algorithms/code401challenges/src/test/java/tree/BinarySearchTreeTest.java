package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testEmptyTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        assertTrue("testEmptyTree should be True", binarySearchTree.isEmpty());

    }

    @Test
    public void testOneNode() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(5);
        assertFalse("testOneNode should be false.", binarySearchTree.isEmpty());
        assertTrue("testOneNode should be true", binarySearchTree.containsNode(5));

    }

    @Test
    public void testOneLeftOneRight(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(5);
        binarySearchTree.add(4);
        binarySearchTree.add(6);

        assertEquals("testOneLeftOneRight root == 5 should be true", 5, (int) binarySearchTree.root.value);
        assertEquals("testOneLeftOneRight left == 4 should be true", 4, (int) binarySearchTree.root.left.value);
        assertEquals("testOneLeftOneRight right == 6 should be true", 6, (int) binarySearchTree.root.right.value);
    }


}