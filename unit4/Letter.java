class Letter {

  private String sender, message;

  public Letter(String s, String m) {
    sender = s;
    message = m;
  }

  public String getSender() {
    return sender;
  }

  public String getMsg() {
    return message;
  }

  public String toString() {
    return sender + " sent: " + message;
  }
}
