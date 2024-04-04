package lecture.chapter9;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
  private int id;
  private String firstName;
  private String lastName;

  public Student(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }

  @Override
  public int compareTo(Student o) {
    if(this.id != o.id){
      return this.id - o.id;
    }
    if(!this.lastName.equals(o.lastName)){
      return this.lastName.compareTo(o.lastName);
    }

    return this.firstName.compareTo(o.firstName);
  }

  @Override
  public boolean equals(Object obj) {
    // Alias Check
    if(this == obj){
      return true;
    }

    // Prüfung auf null
    if(obj == null){
      return false;
    }

    // Typ-Vergleich
    /*
    if(!(obj instanceof Student)){
      return false;
    }
     */

    if(this.getClass() != obj.getClass()){
      return false;
    }

    Student student = (Student)obj;
    if(this.id != student.id){
      return false;
    }

    if(!this.lastName.equals(student.lastName)){
      return false;
    }

    if(!this.firstName.equals(student.firstName)){
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return this.id ^ this.lastName.hashCode() ^ this.firstName.hashCode();
  }
}
