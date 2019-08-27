package utilities;

class fizzBuzzTree{

    public Node<Object> root;

    public Node<Object> popFizz(Node<Object> current){

        if(current != null){
            popFizz(current.left);
            fizTest(current);
            popFizz(current.right);
        }

        return current;
    }

    private Node<Object> fizTest(Node<Object> current){
        if((int) current.value % 15 == 0){
           current.value = (Object) "Fizz Buzz";
       } else if((int) current.value % 3 == 0){
            current.value = (Object) "Fizz";
        }else if((int) current.value % 5 == 0){
            current.value = (Object) "Buzz";
        }
        return current;
    }

    public String toString(){
        return this.toString(this.root).toString();
    }

    public StringBuilder toString(Node<Object> current){
        StringBuilder out = new StringBuilder();

        if(current != null){
            out.append(toString(current.left));

            out.append(current.value).append(", ");

            out.append(toString(current.right));

        }

        return out;
    }

    }

    class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;

        Node(T value, Node<T> right, Node<T> left){
            this.value = value;
            this.right = right;
            this.left = left;
        }


        Node(T value){
            this.value = value;
            right = null;
            left = null;
        }
    }

