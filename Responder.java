import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    private HashMap<String, String> responses;
    
    public Responder()
    {
        responses = new HashMap<>();
        fillResponsesMap();
    }
    
        private void fillResponsesMap() {
        String performanceTip = ("Try restarting your computer to improve performance.");
        String internetTip = ("Make sure your Wi-Fi is turned on and you're connected to the correct network.");
        String loveTip = ("If you enjoy our services,rate us on our website");
        String noiseTip = ("Unusual noise may indicate hardware issues.Consider contacting support");
        String securityTip = ("You can reset your password using the 'Forgot Password' link.");
        String helpTip = ("If you ever need help or assistance, please contact us at our number +1 514-768-8631");
        String errorTip = ("Please provide the exact error message so we can assist you better.");
        
        responses.put("slow", performanceTip);
        responses.put("laggy", performanceTip);
        responses.put("crash", performanceTip);
        responses.put("internet", internetTip);
        responses.put("password", securityTip);
        responses.put("conatct", helpTip);
        responses.put("love",loveTip);
        responses.put("adore", loveTip);
        responses.put("enjoy",loveTip);
        responses.put("like", loveTip);
        responses.put("noise", noiseTip);
        responses.put("loud", noiseTip);
        responses.put("error", errorTip);
        responses.put("not working", errorTip);
        responses.put("unfunctional", errorTip);
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
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
    
    private void printGoodbye(){
    
        System.out.println("Nice talking to you. Bye...");
    }
}

