/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate the second animation of a rabbit.
		The rabbit will be startled by the chipmunk, turn around, and walk towards it.
		It will then move around the chipmunk as if it is examining it.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Rabbit2 extends Thread        // creates a new class called Rabbit2
{
    private Console c;      // class to make rabbit2

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

    public void drawExclamation ()
    {
	c.setColor (Color.red);
	// creates a new font
	c.setFont (new Font ("Calibri", 1, 70));
	// displays an exclamation mark
	c.drawString ("!", 110, 365);

	// used to keep the exclamation mark on the screen
	try
	{
	    sleep (2000);
	}
	catch (Exception e)
	{
	}

	// loop used to erase the exclamation mark
	for (int i = 0 ; i <= 9 ; i++)
	{
	    c.setColor (greenLight);
	    c.drawLine (118 + i, 365, 118 + i, 318);
	}
    }


    public void towardsChipmunk ()
    {
	// loop used to animate the rabbit moving up
	for (int i = 0 ; i <= 50 ; i++)     // up
	{
	    c.setColor (greenLight);
	    c.fillRect (90, 390 - i, 60, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (97, 425 - i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (100, 410 - i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (130, 405 - i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (142, 412 - i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (135, 390 - i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (137, 392 - i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (140, 416 - i, 130, 416 - i);        // whisker 1
	    c.drawLine (140, 418 - i, 130, 420 - i);        // whisker 2
	    c.drawLine (140, 420 - i, 130, 424 - i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (100, 430 - i, 15, 15);              // thigh
	    c.fillRoundRect (107, 438 - i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (128, 432 - i, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving forwards
	for (int i = 0 ; i <= 200 ; i++)    // forwards
	{
	    c.setColor (greenLight);
	    c.fillRect (96 + i, 340, 54, 55);         // erase
	    c.setColor (Color.white);
	    c.fillArc (97 + i, 375, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (100 + i, 360, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (130 + i, 355, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (142 + i, 362, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (135 + i, 340, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (137 + i, 342, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (140 + i, 366, 130 + i, 366);        // whisker 1
	    c.drawLine (140 + i, 368, 130 + i, 370);        // whisker 2
	    c.drawLine (140 + i, 370, 130 + i, 374);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (100 + i, 380, 15, 15);              // thigh
	    c.fillRoundRect (107 + i, 388, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (128 + i, 382, 7, 11, 2, 2);    // front leg

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


    public void drawQuestion ()
    {
	c.setColor (Color.red);
	// creates a new font
	c.setFont (new Font ("Calibri", 1, 70));
	// displays a question mark
	c.drawString ("?", 310, 330);

	// used to keep the quesiton mark on screen
	try
	{
	    sleep (2000);
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


    public void aroundChipmunk ()
    {
	// loop used to animate the rabbit moving up
	for (int i = 0 ; i <= 50 ; i++)    // up
	{
	    c.setColor (greenLight);
	    c.fillRect (297, 340 - i, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (297, 375 - i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (300, 360 - i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (330, 355 - i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (342, 362 - i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (335, 340 - i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (337, 342 - i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (340, 366 - i, 330, 366 - i);        // whisker 1
	    c.drawLine (340, 368 - i, 330, 370 - i);        // whisker 2
	    c.drawLine (340, 370 - i, 330, 374 - i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (300, 380 - i, 15, 15);              // thigh
	    c.fillRoundRect (307, 388 - i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (328, 382 - i, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving to the right
	for (int i = 0 ; i <= 160 ; i++)    // right
	{
	    c.setColor (greenLight);
	    c.fillRect (296 + i, 290, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (297 + i, 325, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (300 + i, 310, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (330 + i, 305, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (342 + i, 312, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (335 + i, 290, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (337 + i, 292, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (340 + i, 316, 330 + i, 316);        // whisker 1
	    c.drawLine (340 + i, 318, 330 + i, 320);        // whisker 2
	    c.drawLine (340 + i, 320, 330 + i, 324);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (300 + i, 330, 15, 15);              // thigh
	    c.fillRoundRect (307 + i, 338, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (328 + i, 332, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving down
	for (int i = 0 ; i <= 120 ; i++)    // down
	{
	    c.setColor (greenLight);
	    c.fillRect (457, 289 + i, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (457, 325 + i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (460, 310 + i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (490, 305 + i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (502, 312 + i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (495, 290 + i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (497, 292 + i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (500, 316 + i, 490, 316 + i);        // whisker 1
	    c.drawLine (500, 318 + i, 490, 320 + i);        // whisker 2
	    c.drawLine (500, 320 + i, 490, 324 + i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (460, 330 + i, 15, 15);              // thigh
	    c.fillRoundRect (467, 338 + i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (488, 332 + i, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving to the left
	for (int i = 0 ; i <= 160 ; i++)    // left
	{
	    c.setColor (greenLight);
	    c.fillRect (457 - i, 409, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (457 - i, 445, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (460 - i, 430, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (490 - i, 425, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (502 - i, 432, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (495 - i, 410, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (497 - i, 412, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (500 - i, 436, 490 - i, 436);        // whisker 1
	    c.drawLine (500 - i, 438, 490 - i, 440);        // whisker 2
	    c.drawLine (500 - i, 440, 490 - i, 444);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (460 - i, 450, 15, 15);              // thigh
	    c.fillRoundRect (467 - i, 458, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (488 - i, 452, 7, 11, 2, 2);    // front leg

	    // used to delay the animation
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the rabbit moving up
	for (int i = 0 ; i <= 70 ; i++)    // up
	{
	    c.setColor (greenLight);
	    c.fillRect (297, 410 - i, 54, 56);         // erase
	    c.setColor (Color.white);
	    c.fillArc (297, 445 - i, 12, 12, 65, 180);     // tail
	    c.setColor (greyLight);
	    c.fillOval (300, 430 - i, 40, 30);              // body
	    c.setColor (Color.white);
	    c.fillOval (330, 425 - i, 20, 20);              // head
	    c.setColor (blue);
	    c.fillOval (342, 432 - i, 4, 4);                // eye
	    c.setColor (greyLight);
	    c.fillOval (335, 410 - i, 7, 24);               // ear
	    c.setColor (pink);
	    c.fillOval (337, 412 - i, 3, 20);               // inner ear
	    c.setColor (Color.black);
	    c.drawLine (340, 436 - i, 330, 436 - i);        // whisker 1
	    c.drawLine (340, 438 - i, 330, 440 - i);        // whisker 2
	    c.drawLine (340, 440 - i, 330, 444 - i);        // whisker 3
	    c.setColor (greyDark);
	    c.fillOval (300, 450 - i, 15, 15);              // thigh
	    c.fillRoundRect (307, 458 - i, 13, 7, 2, 2);    // hind leg
	    c.fillRoundRect (328, 452 - i, 7, 11, 2, 2);    // front leg

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


    public Rabbit2 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	drawExclamation ();     // executes drawExclamation method
	towardsChipmunk ();     // executes towardsChipmunk method
	drawQuestion ();        // executes drawQuestion method
	aroundChipmunk ();      // executes aroundChipmunk method
    }
}
