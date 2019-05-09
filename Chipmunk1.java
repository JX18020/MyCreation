/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the first animation of a chipmunk.
		The chipmunk will enter the console from the right.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Chipmunk1 extends Thread        // creates a new class called Chipmunk1
{
    private Console c;      // class to make chipmunk1

    public void drawChipmunk1 ()
    {
	// local colour variable for the ground
	Color greenLight = new Color (94, 155, 40);
	// local colour variable for the legs
	Color brownDark = new Color (130, 98, 62);
	// local colour variable for the body, ear, and nose
	Color brownMedium = new Color (158, 120, 76);
	// local colour variable for the head, snout, and tail
	Color brownLight = new Color (186, 140, 89);
	// local colour variable for the cheek
	Color pink = new Color (221, 148, 148);

	// loop used to animate the chipmunk walking
	for (int i = 0 ; i <= 300 ; i++)
	{
	    // array of local int variables for x coordinates of the snout
	    int xSnout[] = {666 - i, 672 - i, 672 - i};
	    // array of local int variables for y coordinates of the snout
	    int ySnout[] = {366, 362, 370};

	    c.setColor (greenLight);
	    c.fillRect (665 - i, 355, 82, 30);              // erase
	    c.setColor (brownLight);
	    c.fillOval (700 - i, 368, 40, 10);              // tail
	    c.setColor (brownMedium);
	    c.fillOval (680 - i, 362, 30, 18);              // body
	    c.setColor (Color.black);
	    c.fillRect (682 - i, 365, 24, 7);               // black stripes
	    c.setColor (Color.white);
	    c.fillRect (682 - i, 368, 24, 2);               // white stripe
	    c.setColor (brownLight);
	    c.fillOval (670 - i, 360, 20, 12);              // head
	    c.fillPolygon (xSnout, ySnout, 3);              // snout
	    c.setColor (brownMedium);
	    c.fillOval (680 - i, 355, 7, 10);               // ear
	    c.fillOval (665 - i, 365, 3, 3);                // nose
	    c.setColor (Color.black);
	    c.fillOval (673 - i, 363, 3, 3);                // eye
	    c.setColor (pink);
	    c.drawOval (677 - i, 365, 4, 4);                // cheek
	    c.setColor (brownDark);
	    c.fillOval (700 - i, 370, 15, 15);              // thigh
	    c.fillRoundRect (697 - i, 378, 10, 7, 3, 3);    // hind leg
	    c.fillRoundRect (685 - i, 375, 5, 10, 3, 3);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Chipmunk1 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawChipmunk1 ();       // executes drawChipmunk1 method
    }
}
