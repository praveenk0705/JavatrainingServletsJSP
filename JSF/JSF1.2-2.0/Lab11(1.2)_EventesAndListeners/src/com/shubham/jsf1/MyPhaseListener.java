package com.shubham.jsf1;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener {
	public MyPhaseListener() {
		System.out.println("\n======MyPhaseListener 0-args=====");
	}

	public void beforePhase(PhaseEvent event) {
		System.out.println("\n******beforePhase() Started******");
		System.out.println(event.getPhaseId());
		System.out.println("******beforePhase() Completed******\n");

	}

	public void afterPhase(PhaseEvent event) {
		System.out.println("\n******afterPhase() Started******");
		System.out.println(event.getPhaseId());
		System.out.println("******afterPhase() Completed******\n");
	}

	public PhaseId getPhaseId() {
		System.out.println("\n******getPhaseId() Started******");
		System.out.println(PhaseId.ANY_PHASE);
		System.out.println("******getPhaseId() Completed******\n");
		return PhaseId.ANY_PHASE;

	}
}
