package com.demo.comparablecomparator;

/**
 * @author kaboobal
 *
 */
public class Student implements Comparable<Student> {

  private int sid;

  private String sname;

  private int ssalary;

  /**
   * The constructor.
   *
   * @param sid
   * @param sname
   * @param ssalary
   */
  public Student(int sid, String sname, int ssalary) {

    super();
    this.sid = sid;
    this.sname = sname;
    this.ssalary = ssalary;
  }

  /**
   * @return sid
   */
  public int getSid() {

    return this.sid;
  }

  /**
   * @param sid new value of {@link #getsid}.
   */
  public void setSid(int sid) {

    this.sid = sid;
  }

  /**
   * @return sname
   */
  public String getSname() {

    return this.sname;
  }

  /**
   * @param sname new value of {@link #getsname}.
   */
  public void setSname(String sname) {

    this.sname = sname;
  }

  /**
   * @return ssalary
   */
  public int getSsalary() {

    return this.ssalary;
  }

  /**
   * @param ssalary new value of {@link #getssalary}.
   */
  public void setSsalary(int ssalary) {

    this.ssalary = ssalary;
  }

  @Override
  public String toString() {

    return "Student [sid=" + this.sid + ", sname=" + this.sname + ", ssalary=" + this.ssalary + "]";
  }

  @Override
  public int compareTo(Student st) {

    // if first is greater than second return positive

    if (getSid() > st.getSid())
      return 1;
    else
      return -1;
  }

}
