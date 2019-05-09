/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will display the first background used in the MyCreation animation.
		This class is not a Thread as there are no moving objects.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file

public class Background1        // creates a new class called Background1
{
    private Console c;      // class to make background

    public void drawBackground ()
    {
	// local colour variable for the sky
	Color blueLight = new Color (112, 193, 255);
	// local colour variable for the lake
	Color blueMedium = new Color (57, 106, 191);
	// local colour variable for the name
	Color blueDark = new Color (39, 72, 130);
	// local colour variable for the rocks
	Color greyDark = new Color (100, 100, 100);
	// local colour variable for the mountains and rocks
	Color greyMedium = new Color (137, 137, 137);
	// local colour variable for the mountains
	Color greyLight = new Color (175, 175, 175);
	// local colour variable for the tree trunks
	Color brownDark = new Color (86, 46, 13);
	// local colour variable for the tree trunks
	Color brownLight = new Color (117, 62, 17);
	// local colour variable for the tree leaves
	Color greenDark = new Color (24, 48, 4);
	// local colour variable for the tree leaves
	Color greenDarkMedium = new Color (31, 58, 8);
	// local colour variable for the tree leaves
	Color greenMediumDark = new Color (41, 76, 9);
	// local colour variable for the tree leaves
	Color greenMedium = new Color (55, 91, 20);
	// local colour variable for the tree leaves
	Color greenMediumLight = new Color (63, 104, 7);
	// local colour variable for the tree leaves
	Color greenLightMedium = new Color (78, 132, 30);
	// local colour variable for the grass
	Color greenLight = new Color (94, 155, 40);

	// loop used to make the ground and sky
	for (int i = 0 ; i <= 640 ; i++)
	{
	    c.setColor (greenLight);
	    c.drawLine (0 + i, 200, 0 + i, 500);    // ground

	    c.setColor (blueLight);
	    c.drawLine (0 + i, 0, 0 + i, 200);      // sky
	}

	// loop used to make the middle mountain
	for (int i = 0 ; i <= 200 ; i++)
	{
	    c.setColor (greyDark);
	    c.drawLine (120, 20, 20 + i, 200);      // middle mountain
	}

	c.setColor (greyMedium);
	// loop used to make the left mountain
	for (int i = 0 ; i <= 120 ; i++)
	{
	    c.drawLine (20, 100, -40 + i, 200);     // left mountain
	}

	// loop used to make the right mountain
	for (int i = 0 ; i <= 140 ; i++)
	{
	    c.drawLine (220, 80, 140 + i, 200);     // right mountain
	}

	c.setColor (Color.white);
	// loop used to make the snow on the middle mountain
	for (int i = 0 ; i <= 56 ; i++)
	{
	    c.drawLine (120, 20, 92 + i, 70);       // snow on middle mountain
	}

	// loop used to make the snow points on the middle mountain
	for (int i = 0 ; i <= 14 ; i++)
	{
	    c.drawLine (92 + i, 70, 99, 77);        // snow points on middle mountain
	    c.drawLine (106 + i, 70, 113, 77);
	    c.drawLine (120 + i, 70, 127, 77);
	    c.drawLine (134 + i, 70, 141, 77);
	}

	// loop used to make the snow on the left mountain
	for (int i = 0 ; i <= 24 ; i++)
	{
	    c.drawLine (20, 100, 8 + i, 120);       // snow on left mountain
	}

	// loop used to make the snow points on the left mountain
	for (int i = 0 ; i <= 6 ; i++)
	{
	    c.drawLine (8 + i, 120, 11, 123);       // snow points on left mountain
	    c.drawLine (14 + i, 120, 17, 123);
	    c.drawLine (20 + i, 120, 23, 123);
	    c.drawLine (26 + i, 120, 29, 123);
	}

	// loop used to make the snow on the right mountain
	for (int i = 0 ; i <= 42 ; i++)
	{
	    c.drawLine (220, 80, 196 + i, 116);     // snow on right mountain
	}

	// loop used to make the snow points on the right mountain
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (197 + i, 116, 202, 121);    // snow points on right mountain
	    c.drawLine (207 + i, 116, 212, 121);
	    c.drawLine (217 + i, 116, 222, 121);
	    c.drawLine (227 + i, 116, 232, 121);
	}

	// loop used to make the lake
	for (int i = 0 ; i <= 360 ; i++)
	{
	    c.setColor (blueMedium);
	    c.drawArc (-180, 220, i, 80, 270, 180); // lake
	}

	c.setColor (blueDark);
	// creates new font for name
	c.setFont (new Font ("Calibri", 1, 20));
	// displays name
	c.drawString ("Julia Xie", 20, 265);

	// loop used to make the middle rock
	for (int i = 0 ; i <= 150 ; i++)
	{
	    c.setColor (greyMedium);
	    c.drawOval (90 - i / 2, 540 - i / 2, i, i); // middle rock
	}

	// loop used to make the left and right rock
	for (int i = 0 ; i <= 160 ; i++)
	{
	    c.setColor (greyLight);
	    c.drawArc (-70, 460, i, 120, 0, 90);        // left rock
	    c.drawOval (170 - i / 2, 560 - i / 2, i, i); // right rock
	}

	// loop used to make the small tree trunks
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (brownDark);
	    c.drawLine (340 + i, 240, 340 + i, 80);     // small left tree trunk
	    c.drawLine (460 + i, 240, 460 + i, 80);     // small right tree trunk
	    c.setColor (brownLight);
	    c.drawLine (400 + i, 260, 400 + i, 120);    // small middle tree trunk
	}

	// loop used to make the far away tree trunks
	for (int i = 0 ; i <= 6 ; i++)
	{
	    c.setColor (brownDark);
	    c.drawLine (34 + i, 200, 34 + i, 190);      // second far tree trunk
	    c.drawLine (104 + i, 200, 104 + i, 180);    // fourth far tree trunk
	    c.drawLine (220 + i, 200, 220 + i, 185);    // sixth far tree trunk
	    c.setColor (brownLight);
	    c.drawLine (14 + i, 200, 14 + i, 185);      // first far tree trunk
	    c.drawLine (94 + i, 200, 94 + i, 190);      // third far tree trunk
	    c.drawLine (114 + i, 200, 114 + i, 185);    // fifth far tree trunk
	    c.drawLine (234 + i, 200, 234 + i, 190);    // seventh far tree trunk
	}

	// loop used to make the far right tree trunk and the first, fourth, and sixth far away leaves
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColor (brownLight);
	    c.drawLine (620 + i, 220, 620 + i, 0);      // far right tree trunk
	    c.setColor (greenDark);
	    c.drawLine (17, 150, 7 + i, 185);           // first far tree leaves
	    c.drawLine (107, 145, 97 + i, 180);         // fourth far tree leaves
	    c.drawLine (223, 160, 213 + i, 185);        // sixth far tree leaves
	}

	// loop used to make the second, fifth, third, and seventh far away leaves
	for (int i = 0 ; i <= 16 ; i++)
	{
	    c.setColor (greenDarkMedium);
	    c.drawLine (37, 170, 29 + i, 190);          // second far tree leaves
	    c.drawLine (117, 160, 109 + i, 185);        // fifth far tree leaves
	    c.setColor (greenMediumDark);
	    c.drawLine (97, 170, 89 + i, 190);          // third far tree leaves
	    c.drawLine (237, 165, 229 + i, 190);        // seventh far tree leaves
	}

	// loop used to make the leaves for the small right and left trees
	for (int i = 0 ; i <= 124 ; i++)
	{
	    c.setColor (greenMedium);
	    c.drawLine (360, -60, 298 + i, 80);         // small left tree leaves
	    c.drawLine (480, -60, 418 + i, 80);         // small right tree leaves
	}

	// loop used to make the leaves for the small middle tree
	for (int i = 0 ; i <= 122 ; i++)
	{
	    c.setColor (greenMediumLight);
	    c.drawLine (420, -20, 359 + i, 120);        // small middle tree leaves
	}

	// loop used to make the large tree trunks
	for (int i = 0 ; i <= 60 ; i++)
	{
	    c.setColor (brownLight);
	    c.drawLine (260 + i, 280, 260 + i, 0);      // large left tree trunk
	    c.drawLine (520 + i, 300, 520 + i, 40);     // large right tree trunk
	}

	// loop used to make the twig on the large left tree
	for (int i = 0 ; i <= 50 ; i++)
	{
	    c.setColor (brownDark);
	    c.drawOval (210 + i, 40, 10, 10);           // large left tree twig
	}

	// loop used to make the leaves for the large right tree
	for (int i = 0 ; i <= 180 ; i++)
	{
	    c.setColor (greenLightMedium);
	    c.drawLine (550, -200, 460 + i, 40);        // large right tree leaves
	}

    }


    public Background1 (Console con)   // console is passed as an argument so that all animation display on the same console
    {
	c = con;
	drawBackground ();      // executes drawBackground method
    }
}
