import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Course {
	private long courseId;
	private String courseName;
	private String description;
	Set students;

	//private ArrayList<Student>arrayList=new ArrayList();

	public Course() {}
	public Course(int courseId, String courseName, String description) {}

	public long getCourseId() {return courseId;}
	public void setCourseId(int courseId) {this.courseId = courseId;}
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;}
	public String getDescription() {return description;}          
	public void setDescription(String description) {this.description = description;}
	public Set getStudents() {return students;}
	public void setStudents(Set students) {this.students = students;}

}
class Student{}