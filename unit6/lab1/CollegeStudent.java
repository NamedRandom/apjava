class CollegeStudent extends Student {

  private String major;
  int year;

  public CollegeStudent(
      String name, int age, String gender, String myIdNum, double myGPA, int year, String major) {
    super(name, age, gender, myIdNum, myGPA);
    this.major = major != null ? major : "";
    this.year = year;
  }

  public String toString() {
    return super.toString() + ", year: " + year + ", major: " + major;
  }

  public String getMajor() {
    return major;
  }

  public int getYear() {
    return year;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
