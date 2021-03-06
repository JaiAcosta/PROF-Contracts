package es.upm.grise.profundizacion.contratos.courses;

import com.google.java.contract.Requires;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;

	@Requires("\"MASTER\".equals(course.getLevel()) && (course.getCredits() <= 6 && course.getCredits() >= 1)")
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
