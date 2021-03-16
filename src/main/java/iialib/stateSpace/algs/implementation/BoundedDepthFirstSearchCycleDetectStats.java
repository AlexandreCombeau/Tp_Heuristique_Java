package iialib.stateSpace.algs.implementation;

import iialib.stateSpace.algs.Solution;
import iialib.stateSpace.model.IState;
import iialib.stateSpace.model.IOperator;
import iialib.stateSpace.model.Problem;
import iialib.stateSpace.algs.ASearchAlgorithmStats;

public class BoundedDepthFirstSearchCycleDetectStats<S extends IState<O>, O extends IOperator<S>>
		extends ASearchAlgorithmStats<S, O> {

	private static final String  DESCRIPTION = "Bounded Depth-First Search (with cyle detection)";
	
	Problem<S> problem;
	int maxDepth;

	public BoundedDepthFirstSearchCycleDetectStats(int maxDepth) {
		// TODO;
	}

	@Override
	public Solution<S, O> solve(Problem<S> problem) {
		// TODO
		return null;
	}

}
