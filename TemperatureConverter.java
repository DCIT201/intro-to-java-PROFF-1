
import java.util.Scanner; //Imports Scanner class(Scanner class allows program to accpet user input)


public class TemperatureConverter {
 
      //method that converts celsius to fahrenheit, it accepts user input as parameter
    public static void convertCelsiusToFahrenheit(Scanner userInput) {
       
      //A while loop that allows the user to enter another input incase user enter an invalid input    
      while (true) {
            System.out.println("CELSIUS SCALE - (-273.15 degrees to 100 degrees)");
            System.out.println("Enter Temperature:");
      //input accept but program  is stored into celsiusTemperature variable
            double celsiusTemperature = userInput.nextDouble();
      //conditional statements to check if user input is valid or not 
      /*if user input is valid, program performs arthmetic operation on it and returns the results
       * otherwise it prompts the user to input a valid input
        */
            if (celsiusTemperature >= -273.15 && celsiusTemperature <= 100) {
                double fahrenheitTemperature = (celsiusTemperature * 9.0 / 5) + 32;
                System.out.println(celsiusTemperature + "°C = " + fahrenheitTemperature + "°F");
            } else {
                System.out.println("Invalid input! Please ensure the value is within the range -273.15°C to 100°C.");
            }
      /* Break from while loop for program to end based on user feedback either yes or no */

            System.out.println("Do you want to continue? (yes/no):");//prompt user to choose either to stop of continue another conversion

            //method to accept a single word from user //method to convert the case of user input to lower
            String response = userInput.next().toLowerCase();

            if (response.equals("no")) {
                break;
            }//condition to break while loop 
        }
    }

      //method that converts celsius to fahrenheit, it accepts user input as parameter
      public static void convertFahrenheitToCelsius(Scanner userInput) {
            //A while loop that allows the user to enter another input incase user enter an invalid input
        while (true) {
            System.out.println("FAHRENHEIT SCALE - (-459.67 degrees to 212 degrees)");
            System.out.println("Enter Temperature:");
      //input accept but program  is stored into celsiusTemperature variable
            double fahrenheitTemperature = userInput.nextDouble();
            //conditional statements to check if user input is valid or not 
      /*if user input is valid, program performs arthmetic operation on it and returns the results
       * otherwise it prompts the user to input a valid input
        */
            if (fahrenheitTemperature >= -459.67 && fahrenheitTemperature <= 212) {
                double celsiusTemperature = (fahrenheitTemperature - 32) * 5.0 / 9;
                System.out.println(fahrenheitTemperature + "°F = " + celsiusTemperature + "°C");
            } else {
                System.out.println("Invalid input! Please ensure the value is within the range -459.67°F to 212°F.");
            }
      /* Break from while loop for program to end based on user feedback either yes or no */
            System.out.println("Do you want to continue? (yes/no):");//prompt user to choose either to stop of continue another conversion

           //method to accept a single word from user //method to convert the case of user input to lower
            String response =  userInput.next().toLowerCase();

            if (response.equals("no")) {
                break;
            } //condition to break while loop 
        }
    }

    public static void main(String[] args) {

      //Scanner to accept user selection
        Scanner userInput = new Scanner(System.in); //new scanner object
        System.out.println("A SIMPLE TEMPERATURE CONVERTER");
        System.out.println("Please Choose Your Scale of Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
      // user selection is stored in choice variable
        int choice = userInput.nextInt();
      //Condirional statement to check user selection and invoke coverter method based on  user choice
        if (choice == 1) {
            convertCelsiusToFahrenheit(userInput);//celsius to fahrenheit  method
        } else if (choice == 2) {
            convertFahrenheitToCelsius(userInput);// fahrenheit to celsius method 
        } else {
            System.out.println("Invalid choice! Please restart the program and select either 1 or 2.");
        }

        userInput.close(); //input Scanner close
    }
}
