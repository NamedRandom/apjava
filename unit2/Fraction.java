public class Fraction {
  private int n;
  private int d;

  public Fraction(int n, int d) {
    if (d == 0) {
      System.out.println("Denominator is zero!");
      d = 1;
    }
    this.n = n;
    this.d = d;
    simplify();
  }

  public Fraction() {
    this(0, 1);
  }

  public int getNumerator() {
    return n;
  }

  public int getDenominator() {
    return d;
  }

  public void setNumerator(int n) {
    this.n = n;
  }

  public void setDenominator(int d) {
    this.d = d;
  }

  public String toString() {
    if (n == 0 || d == 1) return "" + n / d;
    return "" + n + "/" + d;
  }

  public Fraction add(Fraction that) {
    return new Fraction(
        this.n * that.getDenominator() + that.getNumerator() * this.d,
        that.getDenominator() * this.d);
  }

  public Fraction subtract(Fraction that) {
    return new Fraction(
        this.n * that.getDenominator() - that.getNumerator() * this.d,
        that.getDenominator() * this.d);
  }

  public Fraction multiply(Fraction that) {
    return new Fraction(
        this.getNumerator() * that.getNumerator(), this.getDenominator() * that.getDenominator());
  }

  public Fraction divide(Fraction that) {
    return new Fraction(
        (this.getNumerator() * that.getDenominator()), this.getDenominator() * that.getNumerator());
  }

  public boolean equals(Fraction that) {
    this.simplify();
    that.simplify();
    return this.getNumerator() == that.getNumerator()
        && this.getDenominator() == that.getDenominator();
  }

  double decimalValue() {
    return n / d;
  }

  int gcf(int x, int y) {
    if (y == 0) return x;
    return gcf(y, x % y);
  }

  void simplify() {
    int gcd = gcf(n, d);
    n /= gcd;
    d /= gcd;
  }
}
