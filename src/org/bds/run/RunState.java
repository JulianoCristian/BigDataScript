package org.bds.run;

/**
 * Run state: Thread execution state
 *
 * @author pcingola
 */
public enum RunState {

	OK // Normal state
	, FATAL_ERROR // Finished executing due to a fatal error
	, FINISHED // Thread execution completely finished (all tasks and threads also finished execution)
	, THREAD_KILLED // Thread was sent a 'kill' signal
	, WAIT_RECOVER // Recovering from a checkpoint, in a "wait" instruction
	;

	//	/**
	//	 * Are we in 'Checkpoint Recovery' mode?
	//	 */
	//	public boolean isCheckpointRecover() {
	//		return this == RunState.WAIT_RECOVER //
	//				|| this == RunState.CHECKPOINT_RECOVER //
	//		;
	//	}

	public boolean isFatalError() {
		return this == FATAL_ERROR;
	}

	public boolean isFinished() {
		return this == FINISHED;
	}

	public boolean isOk() {
		return this == OK;
	}

}
