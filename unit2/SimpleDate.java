class SimpleDate {

  private int day, month, year;
  private int[] month30 = {4, 6, 9, 11};

  public SimpleDate(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
    fix();
  }

  public SimpleDate(int m, int y) {
    this(1, m, y);
  }

  public SimpleDate(int y) {
    this(1, 1, y);
  }

  void advanceDay() {
    day++;
    fix();
  }

  void advanceMonth() {
    month++;
    fix();
  }

  void advanceYear() {
    year++;
  }

  int daysInMonth() {
    if (month == 2) {
      if (isLeapYear()) return 29;
      return 28;
    }
    for (int i : month30) if (month == i) return 30;

    return 31;
  }

  int getDay() {
    return day;
  }

  int getMonth() {
    return month;
  }

  int getYear() {
    return year;
  }

  String getLongDate() {
    switch (month) {
      case 1:
        return "January " + day + ", " + year;
      case 2:
        return "February " + day + ", " + year;
      case 3:
        return "March " + day + ", " + year;
      case 4:
        return "April " + day + ", " + year;
      case 5:
        return "May " + day + ", " + year;
      case 6:
        return "June " + day + ", " + year;
      case 7:
        return "July " + day + ", " + year;
      case 8:
        return "August " + day + ", " + year;
      case 9:
        return "September " + day + ", " + year;
      case 10:
        return "October " + day + ", " + year;
      case 11:
        return "November " + day + ", " + year;
      case 12:
        return "December " + day + ", " + year;
    }
    return "";
  }

  String getShortDate() {
    return month + "/" + day + "/" + year;
  }

  boolean isLeapYear() {
    return (year != 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
  }

  void fix() {
    // feb case
    if (month == 2 && day > 27) {
      if (isLeapYear()) {
        day -= 29;
        month++;
      } else {
        day -= 28;
        month++;
      }
      fix();
    }
    // feb chunk complete

    if (month != 2 && day > 29) {
      for (int i : month30)
        if (month == i && day > 30) {
          day -= 30;
          month++;
        } else {
          day -= 31;
          month++;
        }
      fix();
    }

    if (month > 12) {
      month -= 12;
      year++;
      fix();
    }
  }
}
