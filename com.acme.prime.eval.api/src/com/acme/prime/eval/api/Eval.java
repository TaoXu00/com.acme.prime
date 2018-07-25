package com.acme.prime.eval.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This is an example OSGi enRoute bundle that has a component that implements an
 * API.
 */

@ProviderType
public interface Eval {

	/**
	 * The interface is a minimal method.
	 *
	 * @param message the message to say
	 * @return true if the message could be spoken
	 */
	public double eval(String expression) throws Exception ;

}
