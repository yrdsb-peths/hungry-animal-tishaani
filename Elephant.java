import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Tishaani Ragavan 
 * @version May 2022
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound ("elephantcub.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/idle0.png");
    
    //Direction the elephant is facing
    String facing = "right";
    
    /*
     * Contrustor = The code that  gets run one time when objecct is created
     */
    public Elephant()
    {
        setImage(idle); 
    }
    
    
    public void act()
    {
        // Add your action code here.
       if(Greenfoot.isKeyDown("left"))
       {
           move(-1);
       }
       else if(Greenfoot.isKeyDown("right"))
       {
           move(1);
       }
       
       //Remove apple if elephant eats it
       eat();
    }
    
    /**
     * Eat the apple and spawn new apple if easten
     */
    public void eat()
    {
        if (isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}


