//*
//        *  Name: Siphosethu
//        *  Student Number: 217237614
//        *  Group: 10
//        *
//     */

package za.ac.cput.util;

import java.util.UUID;

public class SiphosethuHelper {
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }

    public static boolean validEmail(String email) {
        String regex = "^\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
        return email.matches(regex);
    }
}
