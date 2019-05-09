/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the seventh animation of a rabbit.
		The rabbit moves to the left in the human's hands.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit7 extends Thread        // creates a new class called Rabbit7
{
    private Console c;      // class to make rabbit7

    public void drawRabbit7 ()
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
	for (int i = 0 ; i <= 600 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (497 - i, 326, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (497 - i, 361, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (500 - i, 346, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (530 - i, 341, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (542 - i, 348, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (535 - i, 326, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (537 - i, 328, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (540 - i, 352, 530 - i, 352);        // whisker 1
	    c.drawLine (540 - i, 354, 530 - i, 356);        // whisker 2
	    c.drawLine (540 - i, 356, 530 - i, 360);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (500 - i, 366, 15, 15);              // thigh
	    c.fillRoundRect (504 - i, 374, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (528 - i, 368, 7, 11, 2, 2);    // front leg

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


    public Rabbit7 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
	drawRabbit7 ();         // executes the drawRabbit7 method
    }
}
