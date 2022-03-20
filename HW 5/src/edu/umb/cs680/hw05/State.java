package edu.umb.cs680.hw05;

public interface State {

	void startButtonPushed();
	void stopButtonPushed();
	void motionDetected();
	void motionNotDetected();
	
}
