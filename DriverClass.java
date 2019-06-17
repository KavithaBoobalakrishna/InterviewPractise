package com.demo.comparablecomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author kaboobal
 *
 */
public class DriverClass {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "Kavitha", 700));
    students.add(new Student(2, "Sush", 800));
    students.add(new Student(3, "Sush", 750));
    students.add(new Student(4, "Priyo", 650));
    students.add(new Student(5, "Ilaks", 900));

    // Comparator<Student> comp = new Comparator<Student>() {
    //
    // @Override
    // public int compare(Student o1, Student o2) {
    //
    // if (o1.getSsalary() > o2.getSsalary())
    // return 1;
    // else
    // return -1;
    // }
    //
    // };

    // Using Java8 sorting based on name and id
    Comparator<Student> com = Comparator.comparing(Student::getSname).thenComparing(Student::getSid);

    students.sort(com);

    // students.sort(com.reversed()); -- for reversing the order or in descending order

    // before java 8 this had to be written for multiple field based sorting
    // public int compareTo(Name n) {
    // int lastCmp = lastName.compareTo(n.lastName); //First compare by last name
    // return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName)); //If lat name matches then compare by first
    // name
    // }

    // Collections.sort(list, comp);

    // for (Student st : students) {
    //
    // System.out.println(st);
    // }

    students.forEach(System.out::println);
  }

}

// POINTS:
// The sortedset and sortedmap internally uses compare() to determine the sort
// The Collections.sort() uses Arrays.sort() which in turn uses Arrays.mergeSort()
// This mergeSort() uses compareTo() to determine the sort
