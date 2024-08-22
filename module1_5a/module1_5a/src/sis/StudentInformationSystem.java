package sis;

public class StudentInformationSystem {
	public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice", "S001");
        Student bob = new Student("Bob", "S002");

        // Create courses
        Course math = new Course("C101", "Mathematics");
        Course science = new Course("C102", "Science");

        // Create enrollment manager
        EnrollmentManager enrollmentManager = new SimpleEnrollmentManager();

        // Enroll students in courses
        enrollmentManager.enrollStudentInCourse(alice, math);
        enrollmentManager.enrollStudentInCourse(bob, science);
        enrollmentManager.enrollStudentInCourse(alice, science);

        // Print enrollment details
        enrollmentManager.printEnrollmentDetails();
    }
}
