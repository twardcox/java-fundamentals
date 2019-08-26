package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TreeTest {

@Test
    public void testPreOrderTraversal(){
    Tree<Integer> tree = new Tree<>();
    tree.root = new Node<Integer>(5, new Node<Integer>(6, new Node<>(3), null), new Node<>(1, null, null));
    tree.preOrder(tree.root);
    assertEquals("testPreOrderTraversal should be true", "[5, 1, 6, 3]", tree.getReturnValues().toString());
}

    @Test
    public void testInOrderTraversal(){
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node<Integer>(5, new Node<Integer>(6, new Node<>(3), null), new Node<>(1, null, null));
        tree.inOrder(tree.root);
        assertEquals("testInOrderTraversal should be true", "[1, 5, 6, 3]", tree.getReturnValues().toString());
    }

    @Test
    public void testPostOrderTraversal(){
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node<Integer>(5, new Node<Integer>(6, new Node<>(3), null), new Node<>(1, null, null));
        tree.postOrder(tree.root);

        assertEquals("testPostOrderTraversal should be true", "[1, 6, 3, 5]", tree.getReturnValues().toString());
    }


}