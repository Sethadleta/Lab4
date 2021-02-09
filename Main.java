import java.util.Random;
//import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    //Scanner s = new Scanner(System.in);
    Random r = new Random();

    int randomInt = r.nextInt(51);
    System.out.println("The random number is: " + randomInt);
    
    int n = randomInt;
    
    if(randomInt <= 15)
    {
      System.out.println("Ahoy mateys!");
    }
    
    if(randomInt > 20)
    {
      System.out.println("Cannonball!");
    }
    else if(randomInt < 42)
    {
      System.out.println("Cannonball!");
    }
    
    if(randomInt > 42)
    {
      System.out.println("Look, a sea shaty!");
    }
    
    while(randomInt >= 0)
    {
      System.out.println(randomInt);
      randomInt--;
    }
    /*
    if(randomInt > 0)
    {
      System.out.println("Ahoy mateys!");
    }
    else if(randomInt <= 15)
    {
      System.out.println("Ahoy mateys!");
    }
    
    if(randomInt > 20)
    {
      System.out.println("Cannonball!");
    }

    else if(randomInt < 42)
    {
      System.out.println("Cannonball!");
    }
    
    if(randomInt > 42)
    {
      System.out.println("Look, a sea shaty!");
    }
    /*
    if(randomInt <= 15)
    {
      System.out.println("Ahoy mateys!");
    }
    
    else if
    {
      20 < randomInt < 42;
      System.out.print("Cannonball!");
    }
    /*
    else(randomInt > 42);
    {
      System.out.println("Look, a sea shaty!");
    }
    */
  }
}