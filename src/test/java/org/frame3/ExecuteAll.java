package org.frame3;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ JUnit1.class, JUnit2.class, JUnit3.class, JUnit4.class })
public class ExecuteAll {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(JUnit1.class, JUnit2.class, JUnit3.class, JUnit4.class);
		System.out.println(r.getFailureCount());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunCount());
		System.out.println(r.getRunTime());
		System.out.println(r.wasSuccessful());
		List<Failure> failures = r.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
		}

	}
}
