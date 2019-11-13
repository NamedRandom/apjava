public class PostOfficeTester {
  public static void main(String[] args) {

    PostOffice branch = new PostOffice(5);
    branch.retrieveMsg(5);
    System.out.println(branch.placeLetter(new Letter("Arnold", "I'll be back!"), 5));
    System.out.println(branch.placeLetter(new Letter("Spock", "Live long and prosper."), 4));
    System.out.println(branch.placeLetter(new Letter("Kirk", "KHAAAAAN!"), 4));
    System.out.println(branch.retrieveMsg(4));
    System.out.println(branch.retrieveMsg(2));
    System.out.println(branch.retrieveMsg(-1));
    System.out.println(branch.placeLetter(new Letter("Harry", "Make my day!"), 0));
    System.out.println(
        branch.placeLetter(
            new Letter("Ellie", "Thanks for the adventure! Now go have another one!"), 1));
    System.out.println(branch.placeLetter(new Letter("Buzz", "To infinity... and beyond!"), 3));
    System.out.println(branch.placeLetter(new Letter("Puppy", "Vet appointment today!"), -3));
    System.out.println(branch.findSender("Kirk"));
    System.out.println(branch.findSender("Ellie"));
  }
}
