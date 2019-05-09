/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program displays the second background used in the MyCreation animation.
		This class is not a Thread as there are no moving objects.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Background2        // creates a new class called Background2
{
    private Console c;      // class to make background

    public void drawBackground2 ()
    {
	// local colour variable for the sky
	Color blueLight = new Color (112, 193, 255);
	// local colour variable for the rocks
	Color greyDark = new Color (100, 100, 100);
	// local colour variable for the rocks
	Color greyMedium = new Color (137, 137, 137);
	// local colour variable for the rocks
	Color greyLight = new Color (175, 175, 175);
	// local colour variable for the tree trunks
	Color brownDark = new Color (86, 46, 13);
	// local colour variable for the tree trunks
	Color brownLight = new Color (117, 62, 17);
	// local colour variable for the tree leaves
	Color greenMedium = new Color (55, 91, 20);
	// local colour variable for the tree leaves
	Color greenMediumLight = new Color (63, 104, 7);
	// local colour variable for the grass
	Color greenLight = new Color (94, 155, 40);
	// local colour variable for the sun
	Color yellow = new Color (214, 194, 12);

	// loop used to make the sky
	for (int i = 0 ; i <= 640 ; i++)
	{
	    c.setColor (blueLight);
	    c.drawLine (0 + i, 0, 0 + i, 280);      // sky
	}

	// loop used to make the sun
	for (int i = 0 ; i <= 60 ; i++)
	{
	    c.setColor (yellow);
	    c.drawOval (410 - i / 2, 50 - i / 2, i, i); // sun
	}

	// loop used to make the big right rock
	for (int i = 0 ; i <= 180 ; i++)
	{
	    c.setColor (greyDark);
	    c.drawOval (640 - i / 2, 280 - i / 2, i, i);
	}

	// loop used to make the big left rock
	for (int i = 0 ; i <= 140 ; i++)
	{
	    c.drawOval (200 - i / 2, 280 - i / 2, i, i);
	}

	// loop used to make the medium right and left rocks
	for (int i = 0 ; i <= 120 ; i++)
	{
	    c.setColor (greyMedium);
	    c.drawOval (160 - i / 2, 280 - i / 2, i, i);
	    c.drawOval (640 - i / 2, 280 - i / 2, i, i);
	}

	// loop used to make the small right and let rocks
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (greyLight);
	    c.drawOval (260 - i / 2, 280 - i / 2, i, i);
	    c.drawOval (580 - i / 2, 280 - i / 2, i, i);
	}

	// loop used to make the ground
	for (int i = 0 ; i <= 640 ; i++)
	{
	    c.setColor (greenLight);
	    c.drawLine (0 + i, 280, 0 + i, 500);    // ground
	}

	// loop used to make the large tree trunks
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (brownLight);
	    c.drawLine (80 + i, 300, 80 + i, 100);
	    c.drawLine (140 + i, 285, 140 + i, 0);
	}

	// loop used to make the small tree trunks
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColor (brownDark);
	    c.drawLine (0 + i, 300, 0 + i, 80);
	    c.drawLine (40 + i, 290, 40 + i, 80);
	}

	// loop used to make the twig on the large tree trunk
	for (int i = 0 ; i <= 50 ; i++)
	{
	    c.drawOval (100 + i, 120, 10, 10);
	}

	// loop used to make the leaves for the large tree
	for (int i = 0 ; i <= 100 ; i++)
	{
	    c.setColor (greenMedium);
	    c.drawLine (50, -120, -10 + i, 80);
	}

	// loop used to make the leaves for the small tree
	for (int i = 0 ; i <= 120 ; i++)
	{
	    c.setColor (greenMediumLight);
	    c.drawLine (100, -100, 40 + i, 100);
	}
    }


    public Background2 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
	drawBackground2 ();     // executes drawBackground2 method
    }
}
