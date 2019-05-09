/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the fourth animation of a rabbit.
		The rabbit continues to be chased by the fox and escapes it byt moving upwards.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit4 extends Thread        // creates a new class called Rabbit4
{
    private Console c;      // class to make rabbit4

    public void drawRabbit4 ()
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

	// loop used to animate the rabbit running to the left
	for (int i = 0 ; i <= 420 ; i++)                // forwards
	{
	    c.setColor (greenLight);
	    c.fillRect (-54 + i, 340, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (-53 + i, 375, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (-50 + i, 360, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (-20 + i, 355, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (-8 + i, 362, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (-15 + i, 340, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (-13 + i, 342, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (-10 + i, 366, -20 + i, 366);        // whisker 1
	    c.drawLine (-10 + i, 368, -20 + i, 370);        // whisker 2
	    c.drawLine (-10 + i, 370, -20 + i, 374);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (-50 + i, 380, 15, 15);              // thigh
	    c.fillRoundRect (-46 + i, 388, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (-22 + i, 382, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (4);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving up
	for (int i = 0 ; i <= 59 ; i++)                // up
	{
	    c.setColor (greenLight);
	    c.fillRect (366, 340 - i, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (367, 375 - i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (370, 360 - i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (400, 355 - i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (412, 362 - i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (405, 340 - i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (407, 342 - i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (410, 366 - i, 400, 366 - i);        // whisker 1
	    c.drawLine (410, 368 - i, 400, 370 - i);        // whisker 2
	    c.drawLine (410, 370 - i, 400, 374 - i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (370, 380 - i, 15, 15);              // thigh
	    c.fillRoundRect (374, 388 - i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (398, 382 - i, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Rabbit4 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawRabbit4 ();     // executes the drawRabbit4 method
    }
}
