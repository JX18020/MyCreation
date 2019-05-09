/*  Name: Julia Xie
    Teacher: Ms. Krasteva
    Date: October 22, 2018
    Assignment: This program will display all classes on the same console.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // gives access to Thread class

public class MyCreation        // creates a new class called MyCreation
{
    Console c;      // class so the output window can be made

    // adds the Background1 thread to MyCreation
    public void background1 ()
    {
	// not a thread because it is not animated
	Background1 b1 = new Background1 (c);
    }


    // adds the Background2 thread to MyCreation
    public void background2 ()
    {
	// not a thread because it is not animated
	Background2 b2 = new Background2 (c);
    }


    // adds the Rabbit1 thread to MyCreation
    public void rabbit1 ()
    {
	// creates the thread
	Rabbit1 r1 = new Rabbit1 (c);

	// starts the thread
	r1.start ();
    }


    // adds the RabbitFamily1 thread to MyCreation
    public void rabbitFamily1 ()
    {
	// creates the thread
	RabbitFamily1 rf1 = new RabbitFamily1 (c);

	// starts the thread
	rf1.start ();

	// joins with Chipmunk1 thread so that it only executes when RabbitFamily1 thread is done
	try
	{
	    rf1.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Chipmunk1 thread to MyCreation
    public void chipmunk1 ()
    {
	// creates the thread
	Chipmunk1 c1 = new Chipmunk1 (c);

	// starts the thread
	c1.start ();

	// joins with Rabbit2 thread so that it only executes when Chipmunk1 thread is done
	try
	{
	    c1.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Rabbit2 thread to MyCreation
    public void rabbit2 ()
    {
	// creates the thread
	Rabbit2 r2 = new Rabbit2 (c);

	// starts the thread
	r2.start ();

	// joins with Chipmunk2 thread so that it only executes when Rabbit2 thread is done
	try
	{
	    r2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Chipmunk2 thread to MyCreation
    public void chipmunk2 ()
    {
	// creates the thread
	Chipmunk2 c2 = new Chipmunk2 (c);

	// starts the thread
	c2.start ();

	// joins with Rabbit3 thread so that it only executes when Chipmunk2 thread is done
	try
	{
	    c2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Rabbit3 thread to MyCreation
    public void rabbit3 ()
    {
	// creates the thread
	Rabbit3 r3 = new Rabbit3 (c);

	// starts the thread
	r3.start ();
    }


    // adds the Fox1 thread to MyCreation
    public void fox1 ()
    {
	// creates the thread
	Fox1 f1 = new Fox1 (c);

	// starts the thread
	f1.start ();

	// joins with Rabbit4 thread so that it only executes when Fox1 thread is done
	try
	{
	    f1.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Rabbit4 thread to MyCreation
    public void rabbit4 ()
    {
	// creates the thread
	Rabbit4 r4 = new Rabbit4 (c);

	// starts the thread
	r4.start ();
    }


    // adds the Fox2 thread to MyCreation
    public void fox2 ()
    {
	// creates the thread
	Fox2 f2 = new Fox2 (c);

	// starts the thread
	f2.start ();

	// joins with Rabbit5 thread so that it only executes when Fox2 thread is done
	try
	{
	    f2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Rabbit5 thread to MyCreation
    public void rabbit5 ()
    {
	// creates the thread
	Rabbit5 r5 = new Rabbit5 (c);

	// starts the thread
	r5.start ();
    }


    // adds the Eagle thread to MyCreation
    public void eagle ()
    {
	// creates the thread
	Eagle e = new Eagle (c);

	// starts the thread
	e.run ();
    }


    // adds the Hedgehogs thread to MyCreation
    public void hedgehogs ()
    {
	Color pink = new Color (209, 117, 138);
	Color grey = new Color (66, 66, 66);
	Color brown = new Color (91, 73, 50);

	// creates the thread
	Hedgehogs hh1 = new Hedgehogs (c, pink, 10, 440);

	// starts the thread
	hh1.start ();

	// creates the thread
	Hedgehogs hh2 = new Hedgehogs (c, grey, 15, 400);

	// starts the thread
	hh2.start ();

	// creates the thread
	Hedgehogs hh3 = new Hedgehogs (c, brown, 5, 360);

	// starts the thread
	hh3.start ();

	// joins with Human1 thread so that it only executes when Hedgehogs thread is done
	try
	{
	    hh2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Human1 thread to MyCreation
    public void human1 ()
    {
	// creates the thread
	Human1 h1 = new Human1 (c);

	// starts the thread
	h1.start ();

	// joins with Rabbit6 thread so that it only executes when Human1 thread is done
	try
	{
	    h1.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Rabbit6 thread to MyCreation
    public void rabbit6 ()
    {
	// creates the thread
	Rabbit6 r6 = new Rabbit6 (c);

	// starts the thread
	r6.start ();

	// joins with Human2 thread so that it only executes when Rabbit6 thread is done
	try
	{
	    r6.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Human2 thread to MyCreation
    public void human2 ()
    {
	// creates the thread
	Human2 h2 = new Human2 (c);

	// starts the thread
	h2.start ();
    }


    // adds the Rabbit7 thread to MyCreation
    public void rabbit7 ()
    {
	// creates the thread
	Rabbit7 r7 = new Rabbit7 (c);

	// starts the thread
	r7.start ();

	// joins with Human3 thread so that it only executes when Rabbit7 thread is done
	try
	{
	    r7.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Human3 thread to MyCreation
    public void human3 ()
    {
	// creates the thread
	Human3 h3 = new Human3 (c);

	// starts the thread
	h3.start ();
    }


    // adds the Rabbit8 thread to MyCreation
    public void rabbit8 ()
    {
	// creates the thread
	Rabbit8 r8 = new Rabbit8 (c);

	// starts the thread
	r8.start ();

	// joins with RabbitFamily2 thread so that it only executes when Rabbit8 thread is done
	try
	{
	    r8.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the RabbitFamily2 thread to MyCreation
    public void rabbitFamily2 ()
    {
	// creates the thread
	RabbitFamily2 rf2 = new RabbitFamily2 (c);

	// starts the thread
	rf2.start ();
    }


    public MyCreation ()   // MyCreation class contructor
    {
	c = new Console ("Lost Rabbit"); // creates a new Console object window
    }


    public static void main (String[] args)  // main method of a Java spplication
    {
	MyCreation z = new MyCreation ();   // constructs a new MyCreation object
	z.background1 ();       // executes background1 method
	z.rabbit1 ();           // executes rabbit1 method
	z.rabbitFamily1 ();     // executes rabbitFamily1 method
	z.chipmunk1 ();         // executes chipmunk1 method
	z.rabbit2 ();           // executes rabbit2 method
	z.chipmunk2 ();         // executes chipmunk2 method
	z.rabbit3 ();           // executes rabbit3 method
	z.fox1 ();              // executes fox1 method
	z.background2 ();       // executes background2 method
	z.rabbit4 ();           // executes rabbit4 method
	z.fox2 ();              // executes fox2 method
	z.rabbit5 ();           // executes rabbit5 method
	z.eagle ();             // executes eagle method
	z.hedgehogs ();         // executes hedgehogs method
	z.human1 ();            // executes human1 method
	z.rabbit6 ();           // executes rabbit6 method
	z.human2 ();            // executes human2 method
	z.rabbit7 ();           // executes rabbit7 method
	z.background1 ();       // executes background1 method
	z.human3 ();            // executes human3 method
	z.rabbit8 ();           // executes rabbit8 method
	z.rabbitFamily2 ();     // executes rabbitFamily2 method
    }
}
