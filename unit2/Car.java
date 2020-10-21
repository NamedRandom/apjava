class Car {
  private String color;
  private double speed;

  Car() {
    this("black",0.0");
  }

  Car(String inColor, double inSpeed) {
    color = inColor;
    speed = inSpeed;
  }

  public double getSpeed() {
    return speed;
  }

  public String getColor() {
    return color;
  }

  public void setSpeed(double s) {
    speed = s;
  }

  public void setColor(String c) {
    color = c;
  }

  public void go() {
    go(60);
  }

  public void go(double inSpeed) {
    speed = inSpeed;
    System.out.println("The car is moving with speed " + speed);
  }

  public void stop() {
    speed = 0;
    System.out.println("The car is not moving. The speed is " + speed);
  }

  public String toString() {
    return "I am a car with speed " + speed + " and color " + color;
  }
}
