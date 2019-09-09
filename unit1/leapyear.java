import java.util.Scanner;

class leapyear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = 1;
        while(year!=0){
            System.out.print("Enter a year 1582 or greater (0 to quit): ");
            year = input.nextInt();
            if(year<1582&&year!=0) System.out.println("ERROR: year must be greater than 1581");
            else if(year!=0&&year%400==0||year%4==0&&year%100!=0) System.out.println(year+" is a leap year");
            else if(year!=0)System.out.println(year+" is not a leap year");
        }
        System.out.println("Goodbye!");
    }
}
