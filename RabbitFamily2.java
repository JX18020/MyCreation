/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the second animation of the rabbit family.
		The family enters from the left of the console to meet the last rabbit.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class RabbitFamily2 extends Thread        // creates a new class called RabbitFamily2
{
    private Console c;      // class to make rabbitFamily2

    // global colour variable for the ground
    Color greenLight = new Color (94, 155, 40);

    public void drawRabbitFamily2 ()
    {
	// local colour variable for the eye
	Color blue = new Color (13, 90, 132);
	// local colour variable for the legs
	Color greyDark = new Color (210, 210, 210);
	// local colour variable for the body and ear
	Color greyLight = new Color (230, 230, 230);
	// local colour variable for the inside of the ear
	Color pink = new Color (255, 206, 206);

	// loop used to animate the rabbit family to the right
	for (int i = 0 ; i <= 200 ; i++)                // forwards
	{
	    // small rabbit
	    c.setColor (greenLight);
	    c.fillRect (-54 + i, 310, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (-53 + i, 345, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (-50 + i, 330, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (-20 + i, 325, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (-8 + i, 332, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (-15 + i, 310, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (-13 + i, 312, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (-10 + i, 336, -20 + i, 336);        // whisker 1
	    c.drawLine (-10 + i, 338, -20 + i, 340);        // whisker 2
	    c.drawLine (-10 + i, 340, -20 + i, 344);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (-50 + i, 350, 15, 15);              // thigh
	    c.fillRoundRect (-46 + i, 358, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (-22 + i, 352, 7, 11, 2, 2);    // front leg

	    // big rabbit
	    c.setColor (greenLight);
	    c.fillRect (-54 + i, 380, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (-53 + i, 415, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (-50 + i, 400, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (-20 + i, 395, 25, 25);              // head
	    c.setColor (blue);
	    c.fillOval (-3 + i, 402, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (-15 + i, 380, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (-13 + i, 382, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (-5 + i, 406, -15 + i, 406);        // whisker 1
	    c.drawLine (-5 + i, 408, -15 + i, 410);        // whisker 2
	    c.drawLine (-5 + i, 410, -15 + i, 414);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (-50 + i, 420, 15, 15);              // thigh
	    c.fillRoundRect (-46 + i, 428, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (-22 + i, 422, 7, 11, 2, 2);    // front leg

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


    public void heart ()
    {
	// local colour variable for the heart
	Color pink = new Color (209, 117, 138);

	// loop used to move the heart up
	for (int i = 0 ; i <= 60 ; i++)
	{
	    // array of local int variable for x coordinates of the heart
	    int xHeart[] = {225, 235, 245};
	    // array of local int variable for y coordinates of the heart
	    int yHeart[] = {370 - i, 385 - i, 370 - i};

	    c.setColor (greenLight);
	    c.fillRect (225, 365 - i, 20, 21);          // erase
	    c.setColor (pink);
	    c.fillPolygon (xHeart, yHeart, 3);          // bottom of the heart
	    c.fillArc (225, 365 - i, 10, 10, 0, 180);   // left bump of the heart
	    c.fillArc (235, 365 - i, 10, 10, 0, 180);   // right bump of the heart

	    // used to delay the animation
	    try
	    {
		sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// used to keep the heart on the screen
	try
	{
	    sleep (1000);
	}
	catch (Exception e)
	{
	}

	// loop used to erase the heart
	for (int i = 0 ; i <= 19 ; i++)
	{
	    c.setColor (greenLight);
	    c.drawLine (225 + i, 305, 225 + i, 325);
	}
    }


    public void curtains ()
    {
	// local colour variable for the curtains
	Color red = new Color (173, 3, 3);

	// loop used to draw curtains
	for (int i = 0 ; i <= 320 ; i++)
	{
	    c.setColor (red);
	    c.drawLine (0 + i, 0, 0 + i, 500);
	    c.drawLine (640 - i, 0, 640 - i, 500);

	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

	c.setColor (Color.white);
	// creates new font for the end
	c.setFont (new Font ("Calibri", 1, 20));
	// displays the end
	c.drawString ("The End", 290, 250);
    }


    public RabbitFamily2 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawRabbitFamily2 ();       // executes the drawRabbitFamily2 method
	heart ();                   // executes the heart method
	curtains ();
    }
}
