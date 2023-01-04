// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 17, 187);
        crab.setLocation(66, 203);
        Leaf leaf =  new  Leaf();
        addObject(leaf, 233, 142);
        Leaf leaf2 =  new  Leaf();
        addObject(leaf2, 371, 306);
        Leaf leaf3 =  new  Leaf();
        addObject(leaf3, 474, 206);
        Starfish starfish =  new  Starfish();
        addObject(starfish, 397, 109);
        Starfish starfish2 =  new  Starfish();
        addObject(starfish2, 522, 341);
        Starfish starfish3 =  new  Starfish();
        addObject(starfish3, 112, 341);
        Leaf leaf4 =  new  Leaf();
        addObject(leaf4, 234, 274);
        Leaf leaf5 =  new  Leaf();
        addObject(leaf5, 540, 63);
        Leaf leaf6 =  new  Leaf();
        addObject(leaf6, 117, 62);
    }
}
