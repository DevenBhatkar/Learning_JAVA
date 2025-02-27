import java.util.Scanner;
public class JAVA_13_Swithcase {
    public static void main(String[] args) {
        String var = "deven";
        System.out.println("Enter your Name");
        Scanner sc = new Scanner (System.in);

        var = sc.nextLine();

/*
        if (age<18) {
            System.out.println("Not eligible");
        }
        else if(age<22){
            System.out.println("you are a fresher");
        }

        else if (age<40){
            System.out.println("you are semi-experienced");

        }
        else if(age<60)
            System.out.println("you are experienced");

        else{
            System.out.println("you are old");
        }
*/

          switch (var){
              case "deven":
                  System.out.println("u can drink softdrinks");
                  break;

              case "defe":
                  System.out.println("u can drink beer");
                  break;

              case "deded":
                  System.out.println("u can drink whiskey");
                  break;

              default:
                  System.out.println("tumhi tumcha enjoy kara");

          }
        System.out.println("mee maaza enjoy karto");




    }
}
