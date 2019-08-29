package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TreeTest {

@Test
    public void testPreOrderTraversal(){
    Tree<Integer> tree = new Tree<>();
    tree.root = new Node(5, new Node(6, new Node<>(3), null), new Node<>(1, null, null));
    tree.preOrder(tree.root);
    assertEquals("testPreOrderTraversal should be true", "[5, 1, 6, 3]", tree.getReturnValues().toString());
}

    @Test
    public void testInOrderTraversal(){
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node(5, new Node(6, new Node<>(3), null), new Node<>(1, null, null));
        tree.inOrder(tree.root);
        assertEquals("testInOrderTraversal should be true", "[1, 5, 6, 3]", tree.getReturnValues().toString());
    }

    @Test
    public void testPostOrderTraversal(){
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node(5, new Node(6, new Node<>(3), null), new Node<>(1, null, null));
        tree.postOrder(tree.root);

        assertEquals("testPostOrderTraversal should be true", "[1, 6, 3, 5]", tree.getReturnValues().toString());
    }


    @Test
    public void testBreadthFirstSearch_Happy() {
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node(2, new Node(5, new Node(9, null, new Node(4, null, null)),
          null),
          new Node(7,
          new Node(6, new Node(11, null, null), new Node(5, null, null)), new Node(2,
            null,
            null)));

        assertEquals("testBreadthFirstSearch_Happy is equal", "[2, 7, 5, 2, 6, 9, 5, " +
                                                                "11, 4]",
          tree.breadthFirstSearch(tree).toString());
    }

    @Test
    public void testfindMaximumValue_Happy(){
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node(5, new Node(6, new Node<>(3), null), new Node<>(1, null, null));
        tree.find_maximum_value(tree.root);
//        System.out.println(tree.find_maximum_value(tree.root));


        assertEquals("testfindMaximumValue_Happy should be equal", "6",
          tree.find_maximum_value(tree.root).toString());
    }
}