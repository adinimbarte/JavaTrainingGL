package JunitPractice;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class Junitc {
@Test
public void setup()
{
	String str="This is my first JUnit Program";
	assertEquals("This is my first JUnit Program",str);
}
}
