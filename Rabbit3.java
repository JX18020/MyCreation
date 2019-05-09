/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the third animation of a rabbit.
		The rabbit will be confused from the chipmunk backing away.
		It will then be chased by a fox and exits the console on the right.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit3 extends Thread      // creates a new class called Rabbit3
{
    private Console c;      // class to make rabbit3

    // global colour variable for the ground
    Color greenLight = new Color (94, 155, 40);

    public void drawQuestion ()
    {
	c.setColor (Color.red);
	// creates a new font
	c.setFont (new Font ("Calibri", 1, 70));
	// displays a question mark
	c.drawString ("?", 310, 330);

	// used to keep the question mark on the screen
	try
	{
	    sleep (1300);
	}
	catch (Exception e)
	{
	}

	// loop used to erase the question mark
	for (int i = 0 ; i <= 25 ; i++)
	{
	    c.setColor (greenLight);
	    c.drawLine (314 + i, 330, 314 + i, 283);
	}

    }


    public void drawRabbit3 ()
    {
	// local colour variable for the eye
	Color blue = new Color (13, 90, 132);
	// local colour variable for the legs
	Color greyDark = new Color (210, 210, 210);
	// local colour variable for the body and ear
	Color greyLight = new Color (230, 230, 230);
	// local colour variable for the inside of the ear
	Color pink = new Color (255, 206, 206);

	// loop used to animate the rabbit running to the right
	for (int i = 0 ; i <= 343 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (296 + i, 340, 54, 56);              // erase
	    c.setColor (Color.white);
	    c.fillArc (297 + i, 375, 12, 12, 65, 180);      // tail
	    c.setColor (greyLight);
	    c.fillOval (300 + i, 360, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (330 + i, 355, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (342 + i, 362, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (335 + i, 340, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (337 + i, 342, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (340 + i, 366, 330 + i, 366);        // whisker 1
	    c.drawLine (340 + i, 368, 330 + i, 370);        // whisker 2
	    c.drawLine (340 + i, 370, 330 + i, 374);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (300 + i, 380, 15, 15);              // thigh
	    c.fillRoundRect (307 + i, 388, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (328 + i, 382, 7, 11, 2, 2);    // front leg

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


    public Rabbit3 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawQuestion ();    // executes the drawQuestion method
	drawRabbit3 ();     // executes the drawRabbit3 method
    }
}
