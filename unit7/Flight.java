public class Flight {
  private Seat[][] mySeats; // a 2D array of Seats on this flight

  // a constructor that creates a row x column matrix of Seats
  public Flight(int rows, int columns) {
    mySeats = new Seat[rows][columns];
    int aisle1 = mySeats[0].length / 2;
    int aisle2 = aisle1 + 1;
    if (mySeats[0].length % 2 == 0) {
      aisle2 = aisle1 - 1;
    }
    for (int i = 0; i < mySeats.length; i++) {
      for (int j = 0; j < mySeats[i].length; j++) {
        if (j == 0 || j == mySeats[i].length - 1) {
          mySeats[i][j] = new Seat(Seat.WINDOW);
        } else if (j == aisle1 || j == aisle2) {
          mySeats[i][j] = new Seat(Seat.AISLE);
        } else {
          mySeats[i][j] = new Seat(Seat.MIDDLE);
        }
      }
    }
  }

  public boolean setPassenger(int row, int column, String name) {
    if (row > mySeats.length || row < 0 || column < 0 || column > mySeats[0].length) return false;
    return mySeats[row][column].setPassenger(new Passenger(name));
  }

  public void printChart() {
    for (int i = 0; i < mySeats.length; i++) {
      for (int j = 0; j < mySeats[0].length; j++) System.out.print(mySeats[i][j] + "\t");
      System.out.println();
    }
  }

  public int emptySeatCount(String seatType) {
    int out = 0;
    for (Seat[] arr : mySeats)
      for (Seat s : arr) {
        if (seatType.equals("any") && s.getPassenger().getName().equals("")) out++;
        if (s.getType().equals(seatType) && s.getPassenger().getName().equals("")) out++;
      }

    return out;
  }

  public int findBlock(int row, int seatsNeeded) {
    if (row < 0 || row > mySeats.length - 1 || seatsNeeded <= 0) return -1;
    int index = 0;
    int seatsInRow=0;
    boolean tmp = false;
    for (int j = 0; j < mySeats[0].length - seatsNeeded; j++) {
      seatsInRow = 0;
      for (int i = j; i < j + seatsNeeded; i++)
        if (mySeats[row][i].getPassenger().getName().equals("")) seatsInRow++;
      index = j;
      if (seatsInRow == seatsNeeded) return index;
    }
    return -1;
  }

  public boolean assignGroup(Passenger[] group) {
    int row = -1;
    int col = -1;
    for (int i = 0; i < mySeats.length; i++) {
      if (findBlock(i, group.length) != -1) {
        row = i;
        col = findBlock(row, group.length);
        for (int j = 0; j < group.length; j++) mySeats[row][col + j].setPassenger(group[j]);
        return true;
      }
    }
    return false;
  }
}
