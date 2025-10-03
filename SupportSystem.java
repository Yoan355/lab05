import java.util.HashMap;
/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();

            if(input.startsWith("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        } 

        
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }
    

public class TechSupport { ////Q33
    private HashMap<String, String> responses;

    public TechSupport() {
        responses = new HashMap<>();
        fillResponsesMap();
    }

    private void fillResponsesMap() {
        responses.put("slow", "Try restarting your computer to improve performance.");
        responses.put("crash", "Please check for software updates or reinstall the application.");
        responses.put("internet", "Make sure your Wi-Fi is turned on and you're connected to the correct network.");
        responses.put("password", "You can reset your password using the 'Forgot Password' link.");
        responses.put("conatct", "If you ever need to contact us, call our number +1 514-908-8865");
        responses.put("love","If you love our servuces,rate us on our website!");
    }

   
    public String generateResponse(String word) {
        String response = responses.get(word);
        if (response != null) {
            return response;
        } else {
            return pickDefaultResponse();
        }
    }

   
    private String pickDefaultResponse() {
        return "I'm not sure how to help with that. Can you give us more details?";
    }

    /**
     * Print a good-bye message to the screen.
     */
    
     private void printGoodbye(){
    
        System.out.println("Nice talking to you. Bye...");
    }
}
}
