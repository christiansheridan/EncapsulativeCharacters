package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

    public static boolean isParenMatch(String str) {
        if (str.isEmpty()){
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '(' || current == '[' || current == '{' || current == '<' || current == '"' || current == '\'') {
                stack.push(current);
            }

            if (current == ')' || current == ']' || current == '}' || current == '>' || current == '"' || current == '\'') {
                if (stack.isEmpty()) {
                    return false;
                    }

                    char last = stack.peek();
                    if (current == ')' && last == '(' || current == ']' && last == '[' || current == '}' && last == '{' || current == '>' && last == '<' || current == '"' && last == '"' || current == '\'' && last == '\'') {
                        stack.pop();
                    } else return false;
                }
            } return stack.isEmpty();
    }
}







//for (int i = 0; i < str.length(); i++) {
//        c = str.charAt(i);
//        if (c == '(') {
//        stack.push(c);
//        }   if (c == '{') {
//        stack.push('c');
//        }   if (c == '[') {
//        stack.push('c');
//        }   if (c == '<') {
//        stack.push('c');
//        }   if (c == '"') {
//        stack.push('c');
//        }   if (c == '\'') {
//        stack.push('c');
//        }
//        else if (c == ')') {
//        if (stack.empty()) {
//        return false;
//        } else if (stack.peek() == '(') {
//        return true;
//        } else return false;
//        }
//        else if(c =='}'){
//        if(stack.empty()){
//        return false;
//        }
//        else if(stack.peek() == '{'){
//        return true;
//        }
//        else return false;
//
//        }
//        else if(c ==']'){
//        if(stack.empty()){
//        return false;
//        }
//        else if(stack.peek() == ']'){
//        return true;
//        }
//        else return false;
//
//        }
//        else if(c =='>'){
//        if(stack.empty()){
//        return false;
//        }
//        else if(stack.peek() == '<'){
//        return true;
//        }
//        else return false;
//
//        }
//        else if(c =='"'){
//        if(stack.empty()){
//        return false;
//        }
//        else if(stack.peek() == '"'){
//        return true;
//        }
//        else return false;
//        }
//        else if(c =='\''){
//        if(stack.empty()){
//        return false;
//        }
//        else if(stack.peek() == '\''){
//        return true;
//        }
//        else return false;
//        }
//        else return false;
//        } return true;