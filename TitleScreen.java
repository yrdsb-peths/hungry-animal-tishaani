import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Tishaani Ragavan
 * @version May 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, 180);
        Label instructionLabel = new Label("Press <space> to begin", 45);
        addObject (instructionLabel, 300, 250);
        Label directionLabel = new Label ("Use < and > to move", 35);
        addObject (directionLabel, 300, 310);
    }
    
    /**
     * The main world act loop
     * 
     */
    public void act()
    {
        //Start the game if user presses space bar
        if (Greenfoot.isKeyDown("space"))
        {
           MyWorld gameWorld =  new MyWorld();
           Greenfoot.setWorld(gameWorld);
        }
        
    }
}
