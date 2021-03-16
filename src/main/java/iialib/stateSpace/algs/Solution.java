package iialib.stateSpace.algs;

import java.util.List;
import java.util.ArrayList;

import iialib.stateSpace.model.IOperator;
import iialib.stateSpace.model.IState;

public class Solution<S extends IState<O>,O extends IOperator<S>> {

	private final S state;
	private final O operator;
	private final Solution<S,O> rest;
	
	
	public Solution(S state, O operator, Solution<S, O> rest) {
		super();
		this.state = state;
		this.operator = operator;
		this.rest = rest;
	}
	public Solution(S state) {
		this(state,null, null);
	}
	public Solution(S state, O operator) {
		this(state,operator, null);
	}


	public S getState() {
		return state;
	}


	public O getOperator() {
		return operator;
	}


	public Solution<S, O> getRest() {
		return rest;
	}


	public List<S> statePath() {
		ArrayList<S> result = new ArrayList<S>();
		Solution<S,O> s = this;
		while (s != null) {
			result.add(s.state);
			s = s.rest;
		}
		return result;
	}

	public List<O> opSequence() {
		ArrayList<O> result = new ArrayList<O>();
		Solution<S,O> s = this;
		while (s != null) {
			if (s.rest != null)
				result.add(s.operator);
			s = s.rest;
		}
		return result;
	}
	
	public String toString() {
		String s = "";
		Solution<S,O> sol = this;
		while (sol != null) {
			s = s + sol.state;
			if (sol.operator != null)
				s = s + " - " + sol.operator  + " -> " ;
			sol = sol.rest;
		}
		return s;
	}

}
