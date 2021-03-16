package iialib.stateSpace.algs.implementation;

import iialib.stateSpace.model.IOperator;
import iialib.stateSpace.model.IState;

public class SSNode<S extends IState<O>, O extends IOperator<S>> {

	private S state;
	private O operator;
	private SSNode<S, O> ancestor;

	public SSNode() {
		state = null;
		operator = null; 
		ancestor = null;
	}

	public SSNode(S state, O operator, SSNode<S, O> ancestor) {
		this.state = state;
		this.operator = operator;
		this.ancestor = ancestor;
	}

	public S getState() {
		return state;
	}

	public O getOperator() {
		return operator;
	}

	public SSNode<S, O> getAncestor() {
		return ancestor;
	}

	public void setState(S state) {
		this.state = state;
	}

	public void setOperator(O operator) {
		this.operator = operator;
	}

	public void setAncestor(SSNode<S, O> ancestor) {
		this.ancestor = ancestor;
	}

	public boolean hasSameState(SSNode<S, O> n) {
		return state.equals(n.state);
	}

	public String toString() {
		return "Node(" + state + "," + operator + ",";
	}

}
