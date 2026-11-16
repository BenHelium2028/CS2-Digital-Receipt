import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      // example RECEIPT PRINTOUT SECTION
      /*
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*     High School Snack Bar          *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..........$1.50          *");                      
      System.out.println("*     Candy ..........$1.25          *");     
      System.out.println("*     Hot Dog ........$2.75          *");     
      System.out.println("*     Hamburger ......$3.50          *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      */


      //My own work starts here

      //variable initilization
      String companyName = "LLC Big Corp";
      double donutPrice = 2.51;
      double codPrice = 12.0;
      double moundsBarPrice = 2.29;
      double coldDogPrice = 1.0;
      double drinkPrice = 47.32;
      
      int orderNumber = (int)(Math.random() * 1000 + 1);
      
      Scanner input = new Scanner(System.in);


      //ordering section
      System.out.println("Welcom to the " + companyName);

      System.out.println("How many donuts do you want?");
      int donutAmount = input.nextInt();
      double donutPaying = donutAmount * donutPrice;

      System.out.println("How many pacific cod do you want?");
      int codAmount = input.nextInt();
      double codPaying = codAmount * codPrice;

      System.out.println("How many mounds bars do you want?");
      int moundsBarAmount = input.nextInt();
      double moundsBarPaying = moundsBarAmount * moundsBarPrice;

      System.out.println("How many cold dogs do you want?");
      int coldDogAmount = input.nextInt();
      double coldDogPaying = coldDogAmount * coldDogPrice;

      System.out.println("How many \"drinks\" do you want?");
      int drinkAmount = input.nextInt();
      double drinkPaying = drinkAmount * drinkPrice;

      double totalPrice = donutPaying + codPaying + moundsBarPaying + coldDogPaying + drinkPaying;


      System.out.println(companyName + "receipt");

      System.out.println("*************************************************");
      System.out.println("*");
      System.out.println("*       " + companyName + " receipt " + orderNumber);
      System.out.println("*");
      System.out.println("*       " + donutAmount + " Dounts " + donutPaying);
      System.out.println("*       " + codAmount + " Pacific Cods " + codPaying);
      System.out.println("*       " + moundsBarAmount + " Mounds Bars " + moundsBarPaying);
      System.out.println("*       " + coldDogAmount + " Cold Dogs " + coldDogPaying);
      System.out.println("*       " + drinkAmount + " \"Drinks\" " + drinkPaying);
      System.out.println("*");
      System.out.println("*       " + "totalPrice " + totalPrice);
      System.out.println("*");
      System.out.println("*************************************************");

      input.close();
   }
}
