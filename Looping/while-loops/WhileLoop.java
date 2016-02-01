import greenfoot.*;

/**
 * Write a description of class ForLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhileLoop extends World
{

    /**
     * Constructor for objects of class WhileLoop.
     * 
     */
    public WhileLoop() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(512,375, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Example example = new Example();
        addObject(example, 462, 191);
    }
}
