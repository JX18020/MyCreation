/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the eighth animation of a rabbit.
		The rabbit moves to the left in the human's hands.
		It then jumps out of the human's hands to meet its family.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit8 extends Thread        // creates a new class called Rabbit8
{
    private Console c;      // class to make rabbit8

    // global colour variable for the ground
    Color greenLight = new Color (94, 155, 40);
    // global colour variable for the eye
    Color blue = new Color (13, 90, 132);
    // global colour variable for the legs
    Color greyDark = new Color (210, 210, 210);
    // global colour variable for the body and ear
    Color greyLight = new Color (230, 230, 230);
    // global colour variable for the inside of the ear
    Color pink = new Color (255, 206, 206);

    public void move ()
    {
	// loop used to animate the rabbit to the left
	for (int i = 0 ; i <= 400 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (697 - i, 326, 54, 56);              // erase
	    c.setColor (Color.white);
	    c.fillArc (697 - i, 361, 12, 12, 65, 180);      // tail
	    c.setColor (greyLight);
	    c.fillOval (700 - i, 346, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (730 - i, 341, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (742 - i, 348, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (735 - i, 326, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (737 - i, 328, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (740 - i, 352, 730 - i, 352);        // whisker 1
	    c.drawLine (740 - i, 354, 730 - i, 356);        // whisker 2
	    c.drawLine (740 - i, 356, 730 - i, 360);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (700 - i, 366, 15, 15);              // thigh
	    c.fillRoundRect (704 - i, 374, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (728 - i, 368, 7, 11, 2, 2);    // front leg

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


    public void jump ()
    {
	// loop used to animate the rabbit jumping out of the human's hands.
	for (int i = 0 ; i <= 50 ; i++)
	{
	    c.setColor (greenLight);
	    c.fillRect (297 - i, 325 + i, 54, 55);         // erase
	    c.setColor (Color.white);
	    c.fillArc (338 - i, 361 + i, 12, 12, 245, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (307 - i, 346 + i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (297 - i, 341 + i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (301 - i, 348 + i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (305 - i, 326 + i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (307 - i, 328 + i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (307 - i, 352 + i, 317 - i, 352 + i);        // whisker 1
	    c.drawLine (307 - i, 354 + i, 317 - i, 356 + i);        // whisker 2
	    c.drawLine (307 - i, 356 + i, 317 - i, 360 + i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (332 - i, 366 + i, 15, 15);              // thigh
	    c.fillRoundRect (327 - i, 374 + i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (312 - i, 368 + i, 7, 11, 2, 2);    // front leg

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


    public Rabbit8 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	move ();        // executes the move method
	jump ();        // executes the jump method
    }
}
