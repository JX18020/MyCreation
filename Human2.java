/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the second animation of a human.
		The human will walk to the left of the console holding the rabbit.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Human2 extends Thread        // creates a new class called Human2
{
    private Console c;      // class to make human2

    public void drawHuman2 ()
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
	for (int i = 0 ; i <= 600 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (545 - i, 310, 56, 140);             // erase
	    c.setColor (red);
	    c.fillRect (570 - i, 360, 20, 40);              // shirt
	    c.setColor (blue);
	    c.fillRect (570 - i, 400, 20, 40);              // pants
	    c.setColor (peach);
	    c.fillOval (560 - i, 320, 40, 40);              // head
	    c.fillRoundRect (575 - i, 365, 10, 30, 3, 3);   // arm
	    c.fillRoundRect (555 - i, 385, 30, 10, 3, 3);   // forearm
	    c.fillOval (543 - i, 383, 14, 14);              // hand
	    c.setColor (Color.black);
	    c.drawRect (575 - i, 405, 5, 7);                // pocket
	    c.fillRoundRect (560 - i, 438, 30, 12, 5, 5);   // shoe
	    c.drawLine (570 - i, 320, 590 - i, 320);        // hat rim
	    c.fillRect (575 - i, 310, 10, 10);              // hat
	    c.fillOval (570 - i, 335, 4, 4);                // eye
	    c.drawArc (555 - i, 332, 20, 20, 270, 50);      // mouth

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


    public Human2 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawHuman2 ();      // executes drawHuman2 method
    }
}
