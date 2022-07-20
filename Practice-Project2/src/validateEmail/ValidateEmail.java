package validateEmail;

import java.util.ArrayList;

public class ValidateEmail {
	
public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("sheela.h@abc.com");
        emailID.add("ken.alfred@abc.com");
        emailID.add("akira.lauren@abc.com");
        emailID.add("shaeen.k@abc.com");
        emailID.add("meera.p@abc.com");
        emailID.add("priya.krish@abc.com");
        emailID.add("shabin.g@abc.com");
        
   
        String validateEmail = "meera.p@abc.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(validateEmail==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID:" + validateEmail + "found");
                        
                        break;
                        
                    }
                }

    }

}