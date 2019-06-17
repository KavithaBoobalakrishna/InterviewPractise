package com.demoexcercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author kaboobal Find the "highest salaried Manager" using stream
 */

class Employee {

  String EName;

  String Designation;

  int salary;

  /**
   * The constructor.
   *
   * @param eName
   * @param designation
   * @param salary
   */
  public Employee(String eName, String designation, int salary) {

    this.EName = eName;
    this.Designation = designation;
    this.salary = salary;
  }

  @Override
  public String toString() {

    return "Employee [EName=" + this.EName + ", Designation=" + this.Designation + ", salary=" + this.salary + "]";
  }

  /**
   * @return salary
   */
  public int getSalary() {

    return this.salary;
  }

  /**
   * @param salary new value of {@link #getsalary}.
   */
  public void setSalary(int salary) {

    this.salary = salary;
  }

  /**
   * @return eName
   */
  public String getEName() {

    return this.EName;
  }

  /**
   * @param eName new value of {@link #geteName}.
   */
  public void setEName(String eName) {

    this.EName = eName;
  }

}

public class HighestSalariedStream {

  public static void main(String[] args) {

    List<Employee> list = new ArrayList<Employee>();
    list.add(new Employee("Sush", "B1", 45000));
    list.add(new Employee("Arya", "A5", 35000));
    list.add(new Employee("Ilaks", "B1", 46000));
    list.add(new Employee("Priyo", "A4", 32000));
    list.add(new Employee("Ayesh", "B2", 46000));
    list.add(new Employee("Haari", "B2", 46000));
    list.add(new Employee("Kavi", "Manager", 56000));
    list.add(new Employee("Anindita", "Manager", 55000));

    list.add(new Employee("Ani", "Manager", 58000));

    // list.forEach(System.out::println);

    Comparator<Employee> bySalary = (Employee o1, Employee o2) -> o1.getSalary() - o2.getSalary();

    Employee sal = list.stream().filter(s -> s.Designation.equals("Manager")).max(bySalary).get();
    System.out.println(sal.getEName());

  }

}
