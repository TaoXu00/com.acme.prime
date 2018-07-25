package com.acme.prime.eval.provider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.osgi.service.component.annotations.Component;

import com.acme.prime.eval.api.Eval;

import parsii.eval.Parser;

import org.apache.felix.service.command.CommandProcessor;




@Component(name="com.acme.prime.eval.provider",
			property = {
					CommandProcessor.COMMAND_SCOPE + ":String=shell",
					CommandProcessor.COMMAND_FUNCTION + ":String=eval"
  }
		)
public class ProviderImpl  implements Eval{

	

	public double eval(String expression) throws Exception {
		/*Pattern EXPR = Pattern.compile( "\\s*(?<left>\\d+)\\s*(?<op>\\+|-)\\s*(?<right>\\d+)\\s*");
	
			Matcher m = EXPR.matcher(expression);
			if ( !m.matches())
				throw new IllegalArgumentException("Invalid expression " + expression);
			
			double left = Double.valueOf( m.group("left"));
			double right = Double.valueOf( m.group("right"));
			switch( m.group("op")) {
			case "+": return left + right;
			case "-": return left - right;
			
			}
			return Double.NaN; */
		return Parser.parse(expression).evaluate();
		}
	}

