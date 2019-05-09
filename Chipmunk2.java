/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the second animation of a chipmunk.
		The chipmunk will back out to the right side of the screen, first slowly, and then fast.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Chipmunk2 extends Thread        // creates a new class called Chipmunk2
{
    private Console c;      // class to make chipmunk2

    // global colour variable used for the ground
    Color greenLight = new Color (94, 155, 40);

    public void drawChipmunk2 ()
    {
	// local colour variable for the legs
	Color brownDark = new Color (130, 98, 62);
	// local colour variable for the body, ear, and nose
	Color brownMedium = new Color (158, 120, 76);
	// local colour variable for the head, snout, and tail
	Color brownLight = new Color (186, 140, 89);
	// local colour variable for the cheek
	Color pink = new Color (221, 148, 148);

	// loop used to animate the chipmunk moving slowly
	for (int i = 0 ; i <= 100 ; i++)
	{
	    // array of local int variables for x coordinates of the snout
	    int xSnout[] = {366 + i, 372 + i, 372 + i};
	    // array of local int variables for y coordinates of the snout
	    int ySnout[] = {366, 362, 370};

	    c.setColor (greenLight);
	    c.fillRect (364 + i, 355, 82, 30);              // erase
	    c.setColor (brownLight);
	    c.fillOval (400 + i, 368, 40, 10);              // tail
	    c.setColor (brownMedium);
	    c.fillOval (380 + i, 362, 30, 18);              // body
	    c.setColor (Color.black);
	    c.fillRect (382 + i, 365, 24, 7);               // black stripes
	    c.setColor (Color.white);
	    c.fillRect (382 + i, 368, 24, 2);               // white stripe
	    c.setColor (brownLight);
	    c.fillOval (370 + i, 360, 20, 12);              // head
	    c.fillPolygon (xSnout, ySnout, 3);              // snout
	    c.setColor (brownMedium);
	    c.fillOval (380 + i, 355, 7, 10);               // ear
	    c.fillOval (365 + i, 365, 3, 3);                // nose
	    c.setColor (Color.black);
	    c.fillOval (373 + i, 363, 3, 3);                // eye
	    c.setColor (pink);
	    c.drawOval (377 + i, 365, 4, 4);                // cheek
	    c.setColor (brownDark);
	    c.fillOval (400 + i, 370, 15, 15);              // thigh
	    c.fillRoundRect (397 + i, 378, 10, 7, 3, 3);    // hind leg
	    c.fillRoundRect (385 + i, 375, 5, 10, 3, 3);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the chipmunk moving fast
	for (int i = 0 ; i <= 200 ; i++)
	{
	    // array of local int variables for x coordinates of the snout
	    int xSnout[] = {466 + i, 472 + i, 472 + i};
	    // array of local int variables for y coordinates of the snout
	    int ySnout[] = {366, 362, 370};

	    c.setColor (greenLight);
	    c.fillRect (464 + i, 355, 82, 30);              // erase
	    c.setColor (brownLight);
	    c.fillOval (500 + i, 368, 40, 10);              // tail
	    c.setColor (brownMedium);
	    c.fillOval (480 + i, 362, 30, 18);              // body
	    c.setColor (Color.black);
	    c.fillRect (482 + i, 365, 24, 7);               // black stripes
	    c.setColor (Color.white);
	    c.fillRect (482 + i, 368, 24, 2);               // white stripe
	    c.setColor (brownLight);
	    c.fillOval (470 + i, 360, 20, 12);              // head
	    c.fillPolygon (xSnout, ySnout, 3);              // snout
	    c.setColor (brownMedium);
	    c.fillOval (480 + i, 355, 7, 10);               // ear
	    c.fillOval (465 + i, 365, 3, 3);                // nose
	    c.setColor (Color.black);
	    c.fillOval (473 + i, 363, 3, 3);                // eye
	    c.setColor (pink);
	    c.drawOval (477 + i, 365, 4, 4);                // cheek
	    c.setColor (brownDark);
	    c.fillOval (500 + i, 370, 15, 15);              // thigh
	    c.fillRoundRect (497 + i, 378, 10, 7, 3, 3);    // hind leg
	    c.fillRoundRect (485 + i, 375, 5, 10, 3, 3);    // front leg

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


    public Chipmunk2 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawChipmunk2 ();       // executes drawChipmunk2 method
    }
}
