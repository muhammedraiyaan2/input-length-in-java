import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter the word");
    Scanner input=new Scanner(System.in);
    String output=input.nextLine();
    int nothing=output.length();
    System.out.println(nothing);
  }
}
