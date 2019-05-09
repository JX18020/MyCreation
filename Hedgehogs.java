/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate 3 different hedgehogs using an overloaded contructor.
		All hedgehogs will be moving from the right of the console to the left.
		The top hedgehog is brown, and has a delay of 5.
		The middle hedgehog is grey, and has a delay of 15.
		The bottom hedgehog is pink, and has a delay of 10.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Hedgehogs extends Thread        // creates a new class called Hedgehogs
{
    private Console c;      // class to make hedgehogs
    // global colour variable for the spines
    private Color spines;
    // global int variable for the delay
    private int delay;
    // global int variable for the y coordinate
    private int yCoord;

    public void drawHedgehogs ()
    {
	// local colour variable for the ground
	Color greenLight = new Color (94, 155, 40);
	// local colour variable for the body and snout
	Color beige = new Color (193, 163, 125);
	// local colour variable for the legs
	Color lightPink = new Color (204, 157, 157);

	// loop to animate the hedgehogs walking to the left
	for (int i = 0 ; i <= 700 ; i++)
	{
	    int xSnout[] = {653 - i, 665 - i, 665 - i};
	    int ySnout[] = {yCoord + 12, yCoord + 3, yCoord + 17};

	    c.setColor (greenLight);
	    c.fillRect (648 - i, yCoord - 3, 48, 30);           // erase
	    c.setColor (beige);
	    c.fillPolygon (xSnout, ySnout, 3);                  // snout
	    c.fillOval (660 - i, yCoord, 30, 20);               // body
	    c.setColor (spines);
	    c.fillArc (657 - i, yCoord - 3, 36, 26, 315, 180);  // spines
	    c.setColor (Color.black);
	    c.fillOval (665 - i, yCoord + 7, 4, 4);             // eye
	    c.fillOval (653 - i, yCoord + 11, 3, 3);            // nose
	    c.setColor (lightPink);
	    c.fillRoundRect (665 - i, yCoord + 15, 5, 7, 2, 2); // front leg
	    c.fillRoundRect (678 - i, yCoord + 15, 5, 7, 2, 2); // hind leg

	    // used to delay the animation
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    // hedgehogs with colour parameter, delay parameter, and y coordinate parameter
    public Hedgehogs (Console con, Color n, int t, int y)
    {
	c = con;
	spines = n;     // colour parameter
	delay = t;      // delay parameter
	yCoord = y;     // y coordinate parameter
    }


    public void run ()
    {
	drawHedgehogs ();       // executes drawHedgehods method
    }
}
