package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.Escalator;
import edu.umb.cs680.hw05.Operating;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.Stopped;

class OperatingTest {

	@Test
	void testGetInstance() {
		State expected = null;
		expected = Operating.getInstance();
		assertNotNull(expected);
	}
	@Test
	void testStartButtonPushed() {
		Escalator escalator = Escalator.getInstance();
		State expected = null;
		escalator.startButtonPushed();
		expected = Operating.getInstance();
		assertNotEquals(Operating.getInstance(), escalator.getState());
	}
	
	@Test
    public void testStopButtonPushed() {
		Escalator escalator = Escalator.getInstance();
		escalator.stopButtonPushed();
		assertSame( Stopped.getInstance() , escalator.getState());
	
	}

	@Test
	void testMotionDetected() {
		Escalator escalator = Escalator.getInstance();
		escalator.motionDetected();
		assertTrue( Operating.getInstance()!= escalator.getState());
	}
	
	@Test
	void testMotionNotDetected() {
		Escalator escalator = Escalator.getInstance();
		escalator.changeState(Operating.getInstance());
		escalator.motionNotDetected();
		assertSame( StandBy.getInstance(), escalator.getState());
	}
	
}
