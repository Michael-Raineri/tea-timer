import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public void Main(){

    }


    public static void main(String[] args) {

        Main teaApplication = new Main();
        String typeOfTea;
        ArrayList<TeaDescription> teaTypes;
        Scanner scanner;
        String output = null;
        Boolean finished = false;
        String teaChosen = null;


        teaTypes = new ArrayList<TeaDescription>();

        //Creates the tea types
        TeaDescription blackTea = new TeaDescription("Black Tea", "Black", 10, 5, 8, 4.5, 90);
        TeaDescription greenTea = new TeaDescription("Green Tea", "Green", 15, 3, 5, 3.5, 80);
        TeaDescription stripOolong = new TeaDescription("Strip Oolong", "Oolong", 20, 5, 9, 5.0, 99);
        TeaDescription ballOolong = new TeaDescription("Ball Oolong", "Oolong", 25, 5, 9, 6.5, 99);
        TeaDescription whiteTea = new TeaDescription("White Tea", "White", 20, 10, 5, 4.0, 85);
        TeaDescription rawPuErh = new TeaDescription("Raw Pu-erh", "Pu-erh", 10, 3, 15, 5.0, 95);
        TeaDescription ripePuErh = new TeaDescription("Ripe Pu-erh", "Pu-erh", 10, 5, 20, 5.0, 99);

        // Add tea types to ArrayList
        teaTypes.add(blackTea);
        teaTypes.add(greenTea);
        teaTypes.add(stripOolong);
        teaTypes.add(ballOolong);
        teaTypes.add(whiteTea);
        teaTypes.add(rawPuErh);
        teaTypes.add(ripePuErh);

        scanner = new Scanner(System.in);

        System.out.println("What tea would you like to brew?");
        System.out.println("For a list of commands type 'help'");

        while (!finished) {
            output = scanner.nextLine();



            for (TeaDescription teas : teaTypes){
                if (output.equalsIgnoreCase(teas.getTeaName())){
                    System.out.println(teas.getTeaDescriptionAll());
                }
            }

            if (output.equalsIgnoreCase("exit")) {
                endProgram();
                finished = true;
            }
            else if (output.equalsIgnoreCase("help")){
                listOfCommands();
            }

            else if (output.toLowerCase().equals("list teas"))
                listOfTeas();
        }







    }

    public static void endProgram()
    {
        System.out.println("Thank you for using this tea application!");
        System.out.println("Goodbye");
    }

    public static void listOfCommands()
    {
        System.out.println("Here are a list of different options you can type");
        System.out.println("Type the tea you want to get the details");
        System.out.println("'exit' - End the program");
        System.out.println("'list teas' - List all teas in the system");
    }

    public static void listOfTeas()
    {
        System.out.println("Black Tea");
        System.out.println("Green Tea");
        System.out.println("Strip Oolong");
        System.out.println("Ball Oolong");
        System.out.println("White Tea");
        System.out.println("Raw Pu-Erh");
        System.out.println("Ripe Pu-Erh");
    }


}

