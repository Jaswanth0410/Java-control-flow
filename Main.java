import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Scanner
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

    //   If Else Statement
      if(n>0){
        System.out.println("Positive Number");  
      }
      else if(n>0){
        System.out.println("Negative Number");
      }
      else{
      System.out.println("Zero");
      }

    //   Switch Case
      switch(n){
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("TuesDay");
        break;
        case 4:
        System.out.println("Wednesday");
        break;
        case 5:
        System.out.println("Thursday");
        break;
        case 6:
        System.out.println("Friday");
        break;
        case 7:
        System.out.println("Saturday");
        break;
        default:
        System.out.println("Invalid Day");
      }

    //   For Loop
      for(int i=0;i<n;i++){
        System.out.println(i);
      }

    //   While Loop
      int j=0;
      while(j<n){
        System.out.println(n);
        n--;
      }

    //   Do-While Loop
      do {
        System.out.println(j);
        j++;
      } while (j<=3);
    }
  }