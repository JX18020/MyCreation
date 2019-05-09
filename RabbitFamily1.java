/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the first animation of the rabbit family.
		The family moves from the right of the console to the left.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class RabbitFamily1 extends Thread        // creates a new class called RabbitFamily1
{
    private Console c;      // class to make rabbitFamily1

    public void drawRabbitFamily1 ()
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

	// loop used to animate the rabbit family to the left
	for (int i = 0 ; i <= 745 ; i++)
	{
	    // small rabbit
	    c.setColor (greenLight);
	    c.fillRect (690 - i, 320, 54, 55);              // erase
	    c.setColor (Color.white);
	    c.fillArc (731 - i, 355, 12, 12, 245, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (700 - i, 340, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (690 - i, 335, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (694 - i, 342, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (698 - i, 320, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (700 - i, 322, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (700 - i, 346, 710 - i, 346);        // whisker 1
	    c.drawLine (700 - i, 348, 710 - i, 350);        // whisker 2
	    c.drawLine (700 - i, 350, 710 - i, 354);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (725 - i, 360, 15, 15);              // thigh
	    c.fillRoundRect (720 - i, 368, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (705 - i, 362, 7, 11, 2, 2);    // front leg

	    // big rabbit
	    c.setColor (greenLight);
	    c.fillRect (640 - i, 355, 54, 55);              // erase
	    c.setColor (Color.white);
	    c.fillArc (681 - i, 390, 12, 12, 245, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (650 - i, 375, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (640 - i, 370, 25, 25);              // head
	    c.setColor (blue);
	    c.fillOval (644 - i, 377, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (648 - i, 355, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (650 - i, 357, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (650 - i, 381, 660 - i, 381);        // whisker 1
	    c.drawLine (650 - i, 383, 660 - i, 385);        // whisker 2
	    c.drawLine (650 - i, 385, 660 - i, 389);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (675 - i, 395, 15, 15);              // thigh
	    c.fillRoundRect (670 - i, 403, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (655 - i, 397, 7, 11, 2, 2);    // front leg

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


    public RabbitFamily1 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawRabbitFamily1 ();       // executes the drawRabbitFamily1 method
    }
}
