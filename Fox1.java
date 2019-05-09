/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the first animation of the fox.
		The fox will chase the rabbit across the first background, from left to right.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Fox1 extends Thread        // creates a new class called Fox1
{
    private Console c;      // class to make fox1

    public void drawFox1 ()
    {
	// local colour variable for the ground
	Color greenLight = new Color (94, 155, 40);
	// local colour variable for the ear
	Color orangeDark = new Color (173, 100, 17);
	// local colour variable for the body
	Color orangeMedium = new Color (188, 115, 32);
	// local colour variable for the head, tail, and snout
	Color orangeLight = new Color (210, 117, 31);
	// local colour variable for the back hind and back front legs
	Color brownDark = new Color (86, 46, 13);
	// local colour variable for the front hind and front front legs
	Color brownLight = new Color (117, 62, 17);

	// loop used to animate the fox running to the right
	for (int i = 0 ; i <= 810 ; i++)
	{
	    // array of local int variable for x coordinates of the top of the snout
	    int xSnoutTop[] = { - 27 + i, -15 + i, -25 + i};
	    // array of local int variable for y coordinates of the top of the snout
	    int ySnoutTop[] = {368, 378, 375};
	    // array of local int variable for x coordinates of the bottom of the snout
	    int xSnoutBottom[] = { - 25 + i, -15 + i, -35 + i};
	    // array of local int variable for y coordinates of the bottom of the snout
	    int ySnoutBottom[] = {375, 378, 387};

	    // array of local int variable for x coordinates of the ear
	    int xEar[] = { - 57 + i, -55 + i, -45 + i};
	    // array of local int variable for y coordinates of the ear
	    int yEar[] = {344, 364, 359};

	    c.setColor (greenLight);
	    c.fillRect (-171 + i, 344, 160, 71);            // erase
	    c.setColor (orangeLight);
	    c.fillOval (-170 + i, 377, 50, 15);             // tail
	    c.setColor (Color.white);
	    c.fillArc (-170 + i, 378, 30, 13, 90, 180);     // tip of tail
	    c.setColor (brownDark);
	    c.fillRoundRect (-115 + i, 390, 10, 25, 5, 5);  // back hind leg
	    c.fillRoundRect (-60 + i, 390, 10, 25, 5, 5);   // back front leg
	    c.setColor (orangeMedium);
	    c.fillOval (-130 + i, 370, 90, 30);             // body
	    c.setColor (orangeLight);
	    c.fillPolygon (xSnoutTop, ySnoutTop, 3);        // top of snout
	    c.setColor (Color.white);
	    c.fillPolygon (xSnoutBottom, ySnoutBottom, 3);  // bottom of snout
	    c.setColor (brownDark);
	    c.fillOval (-19 + i, 376, 5, 5);                // nose
	    c.setColor (orangeLight);
	    c.fillOval (-60 + i, 355, 35, 35);              // head
	    c.setColor (Color.white);
	    c.fillArc (-60 + i, 360, 35, 30, 180, 180);     // bottom of face
	    c.setColor (Color.black);
	    c.fillOval (-35 + i, 365, 4, 4);                // eye
	    c.setColor (orangeDark);
	    c.fillPolygon (xEar, yEar, 3);                  // ear
	    c.setColor (brownLight);
	    c.fillRoundRect (-120 + i, 390, 10, 25, 5, 5);  // front hind leg
	    c.fillRoundRect (-65 + i, 390, 10, 25, 5, 5);   // front front leg

	    // used to delay the animation
	    try
	    {
		sleep (4);
	    }
	    catch (Exception e)
	    {
	    }

	}
    }


    public Fox1 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawFox1 ();        // executes drawFox method
    }
}
