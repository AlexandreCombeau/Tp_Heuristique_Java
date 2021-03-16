package iialib.stateSpace.algs.implementation;

import iialib.stateSpace.algs.Solution;
import iialib.stateSpace.algs.ASearchAlgorithmStats;
import iialib.stateSpace.model.IState;
import iialib.stateSpace.model.IOperator;
import iialib.stateSpace.model.Problem;


public class BreadthFirstSearchStats<S extends IState<O>, O extends IOperator<S>> 
		extends ASearchAlgorithmStats<S, O> {

	private static final String  DESCRIPTION = "Breadth-First Search";

	Problem<S> problem;

	public BreadthFirstSearchStats() {
		 // TODO
	}

	@Override
	public Solution<S, O> solve(Problem<S> p) {
		//TODO
		return null;
	}

}
