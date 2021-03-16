package iialib.stateSpace.algs.implementation;

import iialib.stateSpace.model.Problem;
import iialib.stateSpace.model.IOperator;
import iialib.stateSpace.model.IState;
import iialib.stateSpace.algs.Solution;

import java.util.ArrayList;

import iialib.stateSpace.algs.ASearchAlgorithmStats;

public class DepthFirstSearchCycleDetectStats<S extends IState<O>, O extends IOperator<S>>
		extends ASearchAlgorithmStats<S, O> {

	private static final String  DESCRIPTION = "Depth-First Search (with cyle detection)";

	private ArrayList<Problem> dejaVu;
	public DepthFirstSearchCycleDetectStats() {
			//TODO
		}

	@Override
	public Solution<S, O> solve(Problem<S> problem) {
			//TODO
			return null;
	}

}
