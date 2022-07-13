package org.globallogic;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilTest {
	

@Test
public void setup()
	{
		MathUtils m =new MathUtils();
		double area =m.computeCircleArea(4);
		double expected=4*4*3.141592653;
		assertEquals(expected,area,0.001);
	}
	

}
