


import java.util.HashMap;

    public class PhoneBook  { ///Q27
    private HashMap<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void enterNumber(String name, String number) {
        contacts.put(name, number);
    }

    public String lookupNumber(String name) {
        return contacts.get(name);
    }
    
    public String lookUpName (String number){
     return number;   
    }

}