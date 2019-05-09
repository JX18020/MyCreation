/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the first animation of a human.
		The human will enter from the right of the console.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Human1 extends Thread       // creates a new class called Human1
{
    private Console c;      // class to make human1

    public void drawHuman1 ()
    {
	// local colour variable for the ground
	Color greenLight = new Color (94, 155, 40);
	// local colour variable for the skin
	Color peach = new Color (255, 220, 160);
	// local colour variable for the shirt
	Color red = new Color (173, 3, 3);
	// local colour variable for the pants
	Color blue = new Color (0, 35, 102);

	// loop used to animate the human moving to the left
	for (int i = 0 ; i <= 100 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (645 - i, 310, 56, 140);             // erase
	    c.setColor (red);
	    c.fillRect (670 - i, 360, 20, 40);              // shirt
	    c.setColor (blue);
	    c.fillRect (670 - i, 400, 20, 40);              // pants
	    c.setColor (peach);
	    c.fillOval (660 - i, 320, 40, 40);              // head
	    c.fillRoundRect (675 - i, 365, 10, 30, 3, 3);   // arm
	    c.fillRoundRect (655 - i, 385, 30, 10, 3, 3);   // forearm
	    c.fillOval (643 - i, 383, 14, 14);              // hand
	    c.setColor (Color.black);
	    c.drawRect (675 - i, 405, 5, 7);                // pocket
	    c.fillRoundRect (660 - i, 438, 30, 12, 5, 5);   // shoe
	    c.drawLine (670 - i, 320, 690 - i, 320);        // hat rim
	    c.fillRect (675 - i, 310, 10, 10);              // hat
	    c.fillOval (670 - i, 335, 4, 4);                // eye
	    c.drawArc (655 - i, 332, 20, 20, 270, 50);      // mouth

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


    public Human1 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawHuman1 ();      // executes drawHuman1 method
    }
}
