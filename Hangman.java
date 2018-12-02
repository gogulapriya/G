
import java.util.Scanner.*;
public class Hangman
{
  public void showMenu()
 {
  int option;
  System.out.println("------menu------");
  System.out.println("1.play");
  System.out.println("2.Instructions");
  System.out.println("3.exit");
  System.out.println("\nchoose the option");
 }
  public static void main( String args[]) 
 {
  Hangman hg=new Hangman();
  hg.showMenu();
 }
}

 
  