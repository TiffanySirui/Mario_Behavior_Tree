package marioBehaviorTrees;

import ch.idsia.agents.controllers.*;

public class MoveRightTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		marioAgent.moveRight(true);
		return true;
	}
}
