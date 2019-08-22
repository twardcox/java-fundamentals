package code401challenges.utilities;

import code401challenges.stacksandqueues.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input){

//        create stack
        Stack<String> openingBrackets = new Stack<>();
//        split input

        String[] inputSplit = input.split("");

//        iterate over inputSplit pushing opening brackets into Stack

        for (int i = 0; i< inputSplit.length; i++) {


            if (inputSplit[i].equals("(")){

                openingBrackets.push(inputSplit[i]);

            } else if (inputSplit[i].equals("[")){
                openingBrackets.push(inputSplit[i]);

            } else if (inputSplit[i].equals("{")) {
                openingBrackets.push(inputSplit[i]);

            } else if (inputSplit[i].equals(")")){
                String peeked = openingBrackets.peek();

                if(peeked.equals("(")){
                openingBrackets.pop();
                } else {
                    return false;
                }

            }else if (inputSplit[i].equals("]")){
                String peeked = openingBrackets.peek();

                if(peeked.equals("[")){
                    openingBrackets.pop();
                } else {
                    return false;
                }

            } else if (inputSplit[i].equals("}")){
                String peeked = openingBrackets.peek();

                if(peeked.equals("{")){
                    openingBrackets.pop();
                } else {
                    return false;
                }
            }
        }
        if (openingBrackets.toString() == null){
            return false;
        }





        return true;
    }
}
