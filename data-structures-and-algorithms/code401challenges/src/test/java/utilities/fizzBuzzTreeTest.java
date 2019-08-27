package utilities;

import org.junit.Test;

public class fizzBuzzTreeTest {

    @Test
    public void testFizzBuzzTree() {
        fizzBuzzTree fizzBuzzTree = new fizzBuzzTree();
        fizzBuzzTree.root = new Node<Object>(5, new Node<>(6, new Node<>(8, new Node<>(9, null, null), null), new Node<>(15, null, null)), new Node<>(4, new Node<>(3, null, null), new Node<>(2, new Node<>(1, null, null), null)));
        fizzBuzzTree.popFizz(fizzBuzzTree.root);

        System.out.println(fizzBuzzTree.toString());
    }
}