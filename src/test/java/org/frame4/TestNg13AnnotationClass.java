package org.frame4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class TestNg13AnnotationClass implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class args1, Constructor args2, Method args3) {
		IRetryAnalyzer analyzer = a.getRetryAnalyzer();
		if (analyzer == null) {
			a.setRetryAnalyzer(TestNg11Retry.class);
		}
	}

}
