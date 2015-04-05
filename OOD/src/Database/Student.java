package Database;


import java.util.HashSet;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.Type;
import java.util.Set;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
            
            /**
             * Represents a student object in the hibernate tutorial
             * Student Register example.
             */

@Table(appliesTo="Students")
@Entity
            public class Student {
                // unique student id
            	
                private int studentId;
                // first name of the student
                private String firstName;
                // last name of the student
                private String lastName;
                // address of the student
                private String address;
                // set of courses that the student is related/registered for
                private Set courses = new HashSet();

                public Student() {
                }

                /**
                 * Creates a new instance of Student.
                 * @param firstName first name.
                 * @param lastName last name.
                 * @param i address.
                 */
                public Student(String firstName, String lastName, String i){
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.address = i;
                }
              
                        
                @Column(name = "StudentId",
                        nullable = false,
                        columnDefinition = "raw(16)")
                public int getStudentId(){
                    return studentId;
                }

                public void setStudentId(int studentId){
                    this.studentId = studentId;
                }

                public String getFirstName(){
                    return firstName;
                }
                
                @Column(name = "firstName",
                        nullable = false,
                        columnDefinition = "raw(16)")
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                }

                public String getLastName(){
                    return lastName;
                }
                
                @Column(name = "lastName",
                        nullable = false,
                        columnDefinition = "raw(16)")

                public void setLastName(String lastName){
                    this.lastName = lastName;
                }
                
                @Column(name = "address",
                        nullable = false,
                        columnDefinition = "raw(16)")
                public String getAddress(){
                    return address;
                }

                public void setAddress(String address){
                    this.address = address;
                }

                public Set getCourses(){
                    return courses;
                }
                
                public void setCourses(Set courses){
                    this.courses = courses;
                }

                public String clear(){
                    firstName="";
                    lastName="";
                    address="";
                    return "clear";
                }
            }
            