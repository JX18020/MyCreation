/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will animate an animation of an eagle.
		The eagle will enter from the top right of the console, swoop down, and exit from the top centre of the console.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Eagle implements Runnable        // creates a new class called Eagle
{
    private Console c;      // class to make eagle

    // global colour variable for the sky
    Color blueLight = new Color (112, 193, 255);
    // global colour variable for the body
    Color brownDark = new Color (38, 23, 5);
    // global colour variable for the wings and tail
    Color brownLight = new Color (60, 27, 5);
    // global colour variable for the beak, leg, and claws
    Color yellow = new Color (219, 170, 8);

    public void down ()
    {
	// loop used to animate the eagle flying down
	for (int i = 0 ; i <= 240 ; i++)
	{
	    // array of local int variables for x coordinates of the back wing
	    int xWingBack[] = {670 - i, 670 - i, 700 - i};
	    // array of local int variables for y coordinates of the back wing
	    int yWingBack[] = { - 80 + i, -30 + i, -30 + i};
	    // array of local int variables for x coordinates of the front wing
	    int xWingFront[] = {680 - i, 720 - i, 725 - i};
	    // array of local int variables for y coordinates of the front wing
	    int yWingFront[] = { - 20 + i, -20 + i, -80 + i};

	    // array of local int variables for x coordinates of the tail
	    int xTail[] = {740 - i, 770 - i, 770 - i};
	    // array of local int variables for y coordinates of the tail
	    int yTail[] = { - 20 + i, -40 + i, 0 + i};

	    // array of local int variables for x coordinates of the beak
	    int xBeak[] = {610 - i, 630 - i, 635 - i};
	    // array of local int variables for y coordinates of the beak
	    int yBeak[] = { - 14 + i, -18 + i, -12 + i};

	    c.setColor (blueLight);
	    c.fillRect (610 - i, -81 + i, 161, 105);            // erase
	    c.setColor (brownLight);
	    c.fillPolygon (xWingBack, yWingBack, 3);            // back wing
	    c.fillPolygon (xTail, yTail, 3);                    // tail
	    c.setColor (brownDark);
	    c.fillOval (640 - i, -40 + i, 120, 40);             // body
	    c.setColor (brownLight);
	    c.fillPolygon (xWingFront, yWingFront, 3);          // front wing
	    c.setColor (Color.white);
	    c.fillOval (620 - i, -33 + i, 40, 25);              // head
	    c.setColor (Color.black);
	    c.fillOval (630 - i, -25 + i, 5, 5);                // eye
	    c.setColor (yellow);
	    c.fillPolygon (xBeak, yBeak, 3);                    // beak
	    c.fillRoundRect (725 - i, -10 + i, 10, 20, 3, 3);   // leg
	    c.fillArc (726 - i, 5 + i, 15, 15, 90, 180);        // claw 1
	    c.fillArc (717 - i, 2 + i, 15, 15, 10, 180);        // claw 2

	    // used to delay the animation
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void left ()
    {
	// loop used to animate the eagle flying left
	for (int i = 0 ; i <= 70 ; i++)
	{
	    // array of local int variables for x coordinates of the back wing
	    int xWingBack[] = {430 - i, 430 - i, 460 - i};
	    // array of local int variables for y coordinates of the back wing
	    int yWingBack[] = {160, 210, 210};
	    // array of local int variables for x coordinates of the front wing
	    int xWingFront[] = {440 - i, 480 - i, 485 - i};
	    // array of local int variables for y coordinates of the front wing
	    int yWingFront[] = {220, 220, 160};

	    // array of local int variables for x coordinates of the tail
	    int xTail[] = {500 - i, 530 - i, 530 - i};
	    // array of local int variables for y coordinates of the tail
	    int yTail[] = {220, 200, 240};

	    // array of local int variables for x coordinates of the beak
	    int xBeak[] = {370 - i, 390 - i, 395 - i};
	    // array of local int variables for y coordinates of the beak
	    int yBeak[] = {226, 222, 228};

	    c.setColor (blueLight);
	    c.fillRect (370 - i, 159, 161, 105);            // erase
	    c.setColor (brownLight);
	    c.fillPolygon (xWingBack, yWingBack, 3);        // back wing
	    c.fillPolygon (xTail, yTail, 3);                // tail
	    c.setColor (brownDark);
	    c.fillOval (400 - i, 200, 120, 40);             // body
	    c.setColor (brownLight);
	    c.fillPolygon (xWingFront, yWingFront, 3);      // front wing
	    c.setColor (Color.white);
	    c.fillOval (380 - i, 207, 40, 25);              // head
	    c.setColor (Color.black);
	    c.fillOval (390 - i, 215, 5, 5);                // eye
	    c.setColor (yellow);
	    c.fillPolygon (xBeak, yBeak, 3);                // beak
	    c.fillRoundRect (485 - i, 230, 10, 20, 3, 3);   // leg
	    c.fillArc (486 - i, 245, 15, 15, 90, 180);      // claw 1
	    c.fillArc (477 - i, 242, 15, 15, 10, 180);      // claw 2

	    // used to delay the animation
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void up ()
    {
	// loop used to animate eagle swooping up
	for (int i = 0 ; i <= 100 ; i++)
	{
	    // array of local int variables for x coordinates of the back wing
	    int xWingBack[] = {360 - i, 360 - i, 390 - i};
	    // array of local int variables for y coordinates of the back wing
	    int yWingBack[] = {160 - i, 210 - i, 210 - i};
	    // array of local int variables for x coordinates of the front wing
	    int xWingFront[] = {370 - i, 410 - i, 415 - i};
	    // array of local int variables for y coordinates of the front wing
	    int yWingFront[] = {220 - i, 220 - i, 160 - i};

	    // array of local int variables for x coordinates of the tail
	    int xTail[] = {430 - i, 460 - i, 460 - i};
	    // array of local int variables for y coordinates of the tail
	    int yTail[] = {220 - i, 200 - i, 240 - i};

	    // array of local int variables for x coordinates of the beak
	    int xBeak[] = {300 - i, 320 - i, 325 - i};
	    // array of local int variables for y coordinates of the beak
	    int yBeak[] = {226 - i, 222 - i, 228 - i};

	    c.setColor (blueLight);
	    c.fillRect (300 - i, 159 - i, 161, 105);            // erase
	    c.setColor (brownLight);
	    c.fillPolygon (xWingBack, yWingBack, 3);            // back wing
	    c.fillPolygon (xTail, yTail, 3);                    // tail
	    c.setColor (brownDark);
	    c.fillOval (330 - i, 200 - i, 120, 40);             // body
	    c.setColor (brownLight);
	    c.fillPolygon (xWingFront, yWingFront, 3);          // front wing
	    c.setColor (Color.white);
	    c.fillOval (310 - i, 207 - i, 40, 25);              // head
	    c.setColor (Color.black);
	    c.fillOval (320 - i, 215 - i, 5, 5);                // eye
	    c.setColor (yellow);
	    c.fillPolygon (xBeak, yBeak, 3);                    // beak
	    c.fillRoundRect (415 - i, 230 - i, 10, 20, 3, 3);   // leg
	    c.fillArc (416 - i, 245 - i, 15, 15, 90, 180);      // claw 1
	    c.fillArc (407 - i, 242 - i, 15, 15, 10, 180);      // claw 2

	    // used to delay the animation
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the eagle flying up
	for (int i = 0 ; i <= 160 ; i++)
	{
	    // array of local int variables for x coordinates of the back wing
	    int xWingBack[] = {260, 260, 290};
	    // array of local int variables for y coordinates of the back wing
	    int yWingBack[] = {60 - i, 110 - i, 110 - i};
	    // array of local int variables for x coordinates of the front wing
	    int xWingFront[] = {270, 310, 315};
	    // array of local int variables for y coordinates of the front wing
	    int yWingFront[] = {120 - i, 120 - i, 60 - i};

	    // array of local int variables for x coordinates of the tail
	    int xTail[] = {330, 360, 360};
	    // array of local int variables for y coordinates of the tail
	    int yTail[] = {120 - i, 100 - i, 140 - i};

	    // array of local int variables for x coordinates of the beak
	    int xBeak[] = {200, 220, 225};
	    // array of local int variables for y coordinates of the beak
	    int yBeak[] = {126 - i, 122 - i, 128 - i};

	    c.setColor (blueLight);
	    c.fillRect (200, 59 - i, 161, 105);             // erase
	    c.setColor (brownLight);
	    c.fillPolygon (xWingBack, yWingBack, 3);        // back wing
	    c.fillPolygon (xTail, yTail, 3);                // tail
	    c.setColor (brownDark);
	    c.fillOval (230, 100 - i, 120, 40);             // body
	    c.setColor (brownLight);
	    c.fillPolygon (xWingFront, yWingFront, 3);      // front wing
	    c.setColor (Color.white);
	    c.fillOval (210, 107 - i, 40, 25);              // head
	    c.setColor (Color.black);
	    c.fillOval (220, 115 - i, 5, 5);                // eye
	    c.setColor (yellow);
	    c.fillPolygon (xBeak, yBeak, 3);                // beak
	    c.fillRoundRect (315, 130 - i, 10, 20, 3, 3);   // leg
	    c.fillArc (316, 145 - i, 15, 15, 90, 180);      // claw 1
	    c.fillArc (307, 142 - i, 15, 15, 10, 180);      // claw 2

	    // used to delay the animation
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }



    public Eagle (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
    }


    public void run ()
    {
	down ();            // executes down method
	left ();            // executes left method
	up ();              // executes up method
    }
}
