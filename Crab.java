// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{
    private int growth = 0;

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(0);
        if (Greenfoot.isKeyDown("up")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
        eatLeaf();
        eatStarfish();
    }

    /**
     * 
     */
    public void eatLeaf()
    {
        if (isTouching(Leaf.class)) {
            removeTouching(Leaf.class);
            growth = growth + 1;
            getWorld().showText("Growth: " + growth, 100, 30);
        }
    }

    /**
     * 
     */
    public void eatStarfish()
    {
        if (isTouching(Starfish.class)) {
            removeTouching(Starfish.class);
            growth = growth + 5;
            getWorld().showText("Growth: " + growth, 100, 30);
        }
    }
}
