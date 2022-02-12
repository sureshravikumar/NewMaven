package org.frame4;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNg11Retry implements IRetryAnalyzer {
	int min = 0;
	int max = 3;

	public boolean retry(ITestResult result) {
		if (min < max) {
			min++;
			return true;
		}
		return false;
	}

}
