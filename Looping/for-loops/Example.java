import greenfoot.*;

/**
 * Write a description of class Example here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Example extends Actor
{
    /**
     * Act - do whatever the Example wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    // Instructions
    // In this example for loop we use a variable 
    // that we call "count" to initialize and update
    // for each iteration of the for loop.
    
    // Our first example will start at count=1, and
    // execute the code inside the {} until count 
    // is equal to 5.  Our increment in the first
    // example is +1.
    
    // Run the code as is and look at the output. Do
    // you understand why it prints what it does?
    
    // Try rewriting the loop so that the starting 
    // value is 10 and the ending value is 1 and the
    // increment is -1.  Do you see the difference?
    
    // Try to rewrite the for loop so that it prints the
    // following output:
    
    // Counting by threes. Next value is 3
    // Counting by threes. Next value is 6
    // Counting by threes. Next value is 9
    // Counting by threes. Next value is 12
    
    for (int count=1;count<=5;count++){
        System.out.println("count is "+count);
    }    
    Greenfoot.stop();// this just stops the program after 
                     // our program executes once through
                     // the for loop
}
}
