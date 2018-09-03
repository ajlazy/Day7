
package com.capgemini.day7;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q8DaydatemonthTest {

	@Test
		void testDDMY() {
			assertEquals("Fri, 27 June 2003" , Q8DateDaymonth.DDMY("27/06/2003"));
			assertEquals("Sun, 02 September 2018" , Q8DateDaymonth.DDMY("02/09/2018"));

			
		}

	
	}


