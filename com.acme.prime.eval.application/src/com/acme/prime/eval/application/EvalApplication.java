package com.acme.prime.eval.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.acme.prime.eval.api.Eval;

import org.apache.felix.service.command.CommandProcessor;

@Component(
		service=EvalApplication.class, 
				property = {
						CommandProcessor.COMMAND_SCOPE + ":String=shell",
						CommandProcessor.COMMAND_FUNCTION + ":String=eval"
	  },
		name="com.acme.prime.eval.application"
	)
	public class EvalApplication {
		private Eval eval;

		public double eval(String m) throws Exception {
			return eval.eval(m);
		}
		
		@Reference
		void setEval( Eval eval) {
			this.eval= eval;
		}
	}
