/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the first animation of a rabbit.
		The rabbit will enter from the right of the console and stops on the left of the console.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit1 extends Thread       // creates a new class called Rabbit1
{
    private Console c;      // class to make rabbit1

    public void drawRabbit1 ()
    {
	// local colour variable for the ground
	Color greenLight = new Color (94, 155, 40);
	// local colour variable for the eye
	Color blue = new Color (13, 90, 132);
	// local colour variable for the legs
	Color greyDark = new Color (210, 210, 210);
	// local colour variable for the body and ear
	Color greyLight = new Color (230, 230, 230);
	// local colour variable for the inside of the ear
	Color pink = new Color (255, 206, 206);

	// loop used to animate the rabbit moving to the left
	for (int i = 0 ; i <= 650 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (740 - i, 390, 54, 55);         // erase
	    c.setColor (Color.white);
	    c.fillArc (781 - i, 425, 12, 12, 245, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (750 - i, 410, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (740 - i, 405, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (744 - i, 412, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (748 - i, 390, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (750 - i, 392, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (750 - i, 416, 760 - i, 416);        // whisker 1
	    c.drawLine (750 - i, 418, 760 - i, 420);        // whisker 2
	    c.drawLine (750 - i, 420, 760 - i, 424);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (775 - i, 430, 15, 15);              // thigh
	    c.fillRoundRect (770 - i, 438, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (755 - i, 432, 7, 11, 2, 2);    // front leg

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


    public Rabbit1 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawRabbit1 ();     // executes drawRabbit1 method
    }
}
