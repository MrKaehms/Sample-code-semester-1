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
    // In this example while loop we use a variable 
    // that we call "i" as our comparison variable.
    
    // Our first example will start at x=0, and
    // execute the code inside the {} until count 
    // is equal to 4.  
    
    // Run the code as is and look at the output. Do
    // you understand why it prints what it does?
    
    // Does it print the line "x = 4"?  Why or why not?
    
    // Try rewriting the while loop so that the starting 
    // value is 10 and the ending value is 2 and the
    // increment is -2.  Do you see the difference?
    
    // Note that we are showing an example that looks like an
    // if statement becuase we are incrementing or decrementing
    // the value of the variable used in the while loop's test.
    
    //  We could, however, write a simple while loop that 
    //  performs a logical test for true or false, and continues to
    //  execute until the actor's position is at world's edge, as follow:
    
    
    //  while (!atEdge()){
    //       move(1);
    //  }
    
    // What happens when the above runs?
    
    // Try to rewrite the for loop so that it prints the
    // following output:
    
    //x=1;
    //x=2;
    
      while (!isAtEdge()){
           move(1);
    }
    Greenfoot.stop();
    int x=0;
    while (x !=4 ){
        System.out.println("x = "+x);
        x=x+1; // we could also write this x+=1;
    }    
    Greenfoot.stop();// this just stops the program after 
                     // our program executes once through
                     // the for loop
}
}
