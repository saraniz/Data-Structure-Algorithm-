//stack

//Stack is LIFO data structure.
// stores objects into a sort of "vertical tower"
// stack have five methods.
// They are push(),pop(),peek(),remove(),search()
//push() = add to the top
// pop() = remove from the top

// uses of stack

// 1. undo/redo features in text editors.
// 2. moving back/forward through browser history
// 3. backtracking algorithms (maze, file directories)
// 4. calling functions (call stack)

import java.util.Stack;

public class Main{

    public static void main(String[] args){

        //new Stack<String> this create new empty stack
        // <String> mean stack contains only strings
        // Stack is generic class in Java
        // () mean constructor
        Stack<String> stack = new Stack<String>();

        stack.push("Harry Potter");
        stack.push("Lord of the Rings");
        stack.push("Pirates of the Caribian");
        stack.push("Narnia");

        // String favMovie = stack.pop();

        // System.out.println(stack);
        // // System.out.println(favMovie);
        // // System.out.println(stack.peek());
        // System.out.println(stack.search("Harry Potter"));



    }
}