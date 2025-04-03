public class Recursion {
    

    //recursion =  when a thing is defined in terms of itself. 
    //apply the result of procedure, to a pprocedure
    //a recursve method calls itself. can be a substitute for iteration
    //divide a problem into sub problems of the same type as the original
    //commonly used with advanced sorting algorithms and navigating trees

    //advantages
    //easier to read/write
    //easier to debug

    //disadvantages
    //sometimes slower
    //usesmore memory

    public static void main(String[] args) {
        
        walk(5);
    }

    private static void walk(int steps) {

        if(steps < 1){
            return;
        }
        System.out.println("You take a step:");
        walk(steps - 1); //recursive case
    }
}
