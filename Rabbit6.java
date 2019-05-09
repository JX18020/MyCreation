/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the sixth animation of a rabbit.
		The rabbit moves down and is confused by the human.
		It then jumps into the human's hands.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit6 extends Thread        // creates a new class called Rabbit6
{
    private Console c;      // class to make rabbit6

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

    public void down ()
    {
	// loop used to animate the rabbit moving down
	for (int i = 0 ; i <= 130 ; i++)                // down
	{
	    c.setColor (greenLight);
	    c.fillRect (366, 280 + i, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (367, 316 + i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (370, 301 + i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (400, 296 + i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (412, 303 + i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (405, 281 + i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (407, 283 + i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (410, 307 + i, 400, 307 + i);        // whisker 1
	    c.drawLine (410, 309 + i, 400, 311 + i);        // whisker 2
	    c.drawLine (410, 311 + i, 400, 315 + i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (370, 321 + i, 15, 15);              // thigh
	    c.fillRoundRect (374, 329 + i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (398, 323 + i, 7, 11, 2, 2);    // front leg

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


    public void drawQuestion ()
    {
	c.setColor (Color.red);
	// creates a new font
	c.setFont (new Font ("Calibri", 1, 70));
	// display a question mark
	c.drawString ("?", 380, 400);

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
	    c.drawLine (384 + i, 400, 384 + i, 353);
	}

    }


    public void jump ()
    {
	// loop used to animate the rabbit moving forwards
	for (int i = 0 ; i <= 45 ; i++)                // forwards
	{
	    c.setColor (greenLight);
	    c.fillRect (366 + i, 410, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (367 + i, 446, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (370 + i, 431, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (400 + i, 426, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (412 + i, 433, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (405 + i, 411, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (407 + i, 413, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (410 + i, 437, 400 + i, 437);        // whisker 1
	    c.drawLine (410 + i, 439, 400 + i, 441);        // whisker 2
	    c.drawLine (410 + i, 441, 400 + i, 445);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (370 + i, 451, 15, 15);              // thigh
	    c.fillRoundRect (374 + i, 459, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (398 + i, 453, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving up
	for (int i = 0 ; i <= 85 ; i++)                // up
	{
	    c.setColor (greenLight);
	    c.fillRect (411 + i, 411 - i, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (412 + i, 446 - i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (415 + i, 431 - i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (445 + i, 426 - i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (457 + i, 433 - i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (450 + i, 411 - i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (452 + i, 413 - i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (455 + i, 437 - i, 445 + i, 437 - i);        // whisker 1
	    c.drawLine (455 + i, 439 - i, 445 + i, 441 - i);        // whisker 2
	    c.drawLine (455 + i, 441 - i, 445 + i, 445 - i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (415 + i, 451 - i, 15, 15);              // thigh
	    c.fillRoundRect (419 + i, 459 - i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (443 + i, 453 - i, 7, 11, 2, 2);    // front leg

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


    public Rabbit6 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	down ();
	drawQuestion ();        // executes the drawQuestion method
	jump ();                // executes the jump method
    }
}
