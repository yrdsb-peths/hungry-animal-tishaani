import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephantt.
 * 
 * @author Tishaani Ragavan 
 * @version May 2022
 */
public class Apple extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    setLocation(getX(), getY() + speed);
    
    MyWorld world = (MyWorld) getWorld();
    if(getY() >= world.getHeight())
    {
        world.gameOver();
        world.removeObject(this);
    }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
