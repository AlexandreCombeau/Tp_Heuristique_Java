package problems.jugs;

import java.util.Arrays;
import java.util.List;
import iialib.stateSpace.model.IOperator;

public class JugOperator implements IOperator<JugState> {
      // TODO - You free to reorganize as you want
 
     // ------------ Methods from IOperator interface -------------------
    
	@Override
	public String getName() {
	   //TODO
	   return "";
    }

	@Override
   public boolean isApplicable(JugState s){
		// TODO
        return false;
	}

	@Override
    public JugState successor(JugState state) {
		//TODO
	    return null;
    }

	@Override
    public String toString() {
    	// TODO
    	return "";
       }

}
