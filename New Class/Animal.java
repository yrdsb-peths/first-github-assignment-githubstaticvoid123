import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int x; 
    private int y; 
    public void act()
    {
        // Add your action code here 
        getWorld().addObject(new Animal(), 0, 0);
        move(-2); 
    }
    
    public GreenfootImage (0, 0); 
}
