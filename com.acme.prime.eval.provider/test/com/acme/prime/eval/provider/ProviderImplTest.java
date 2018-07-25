package com.acme.prime.eval.provider;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import junit.framework.TestCase;

import com.acme.prime.eval.provider.ProviderImpl;

/*
 * Example JUNit test case
 *
 */

public class ProviderImplTest {

	/*
	 * Example test method
	 */

	
	@Test
	public void simple() throws Exception {
		ProviderImpl impl = new ProviderImpl();
		assertNotNull(impl);
		assertEquals(3.0,impl.eval("1+2"),0);
	}

}
