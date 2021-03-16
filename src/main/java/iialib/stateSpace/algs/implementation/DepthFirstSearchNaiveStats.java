package iialib.stateSpace.algs.implementation;

import iialib.stateSpace.model.Problem;
import problems.turtle.TurtleOperator;
import iialib.stateSpace.model.IOperator;
import iialib.stateSpace.model.IState;
import iialib.stateSpace.algs.Solution;

import java.util.ArrayList;
import java.util.Iterator;

import iialib.stateSpace.algs.ASearchAlgorithmStats;

public class DepthFirstSearchNaiveStats<S extends IState<O>, O extends IOperator<S>> 
			extends ASearchAlgorithmStats <S, O> {

	private static final String  DESCRIPTION = "Naive Depth-First search";
	
	public DepthFirstSearchNaiveStats() {
		//TODO
	}

	@Override
	public Solution<S, O> solve(Problem<S> problem) {
		try {
			Solution<S, O> sol = search(problem.getInitialState(), problem);
			return sol;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Solution<S,O> search (S s, Problem<S> problem){
		if (  problem.isTerminal(s)) {
			return new Solution<S, O>(s);
		}else {
			ArrayList<S> succs = new ArrayList<S>();
			Iterator<O> it = s.applicableOperators();
			
			it.forEachRemaining(o -> {
				succs.add(o.successor(s));
								});
			Solution<S, O> res;
			for (S succ : succs) {
				res = search(succ, problem);
				if (res != null) {
					return new Solution<S, O>(succ, res.getOperator(), res);
				}
			}
			return null;
		}
	}

}
