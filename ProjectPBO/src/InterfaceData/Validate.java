/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceData;
import GUI.Progress;
import GUI.InputAdmin;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Rafly
 */
public interface Validate {
    public static boolean isValid(String email) {     

        Pattern pattern = Pattern.compile("[@]+", Pattern.CASE_INSENSITIVE); 
        Matcher matcher = pattern.matcher(email);
        boolean isEmailValid = matcher.find();
        if(isEmailValid) { 
         return true;   
        }
      return false;
    };

    //Interface default
    public default boolean isAdmin(String code) { 

        return ((code.equals("admindata"))? true : false);
     
    }
}
