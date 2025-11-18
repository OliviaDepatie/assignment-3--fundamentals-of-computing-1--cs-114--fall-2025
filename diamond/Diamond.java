import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    int diamondSize, middle, leadingSpaces, stars;
    System.out.println("Enter a number: ");

    Scanner scan = new Scanner(System.in);
    diamondSize = scan.nextInt();
    middle = diamondSize / 2;

    if (diamondSize % 2 == 1){

      for (int i = 0; i <= middle; i++){
        for (int j = 0; j < middle - i; j++){
          System.out.print(" ");
        }
        for (int k = 0; k < 2 * i + 1; k++){
          System.out.print("*");
        }
        System.out.println();
      }
      for(int i = middle - 1; i >= 0; i--){
        for (int j = middle - i; j > 0; j--){
          System.out.print(" ");
        }
        for (int k = 2 * i + 1; k > 0; k--){
          System.out.print("*");
        }
        System.out.println();
      }
    }

    else{
      for(int i = 1; i <= middle + 1; i++){
        stars = (i==1) ? 1 : 2 * (i - 1);
        leadingSpaces = diamondSize - stars;

        for (int j = 0; j < leadingSpaces; j++){
          System.out.print(" ");
        }
        for (int k = 0; k < stars; k++){
          System.out.print("* ");
        }
        System.out.println();
      }
      for (int i = middle; i >= 1; i--){
        stars = (i==1) ? 1 : 2 * (i - 1);
        leadingSpaces = diamondSize - stars;

        for (int j = 0; j < leadingSpaces; j++){
          System.out.print(" ");
        }
        for (int k = 1; k <= stars; k++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }
    scan.close();
  }
}
