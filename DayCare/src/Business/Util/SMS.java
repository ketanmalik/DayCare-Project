/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class SMS {

    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC2583eeee5da5edabf0a195ee91b7e62f";
    public static final String AUTH_TOKEN = "5c041a1e36242ec74110b78b37921a1f";
    
    public static void sendSMS(String msg) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        Message message = Message.creator(new PhoneNumber("+18572078509"),
                new PhoneNumber("+18572142194"),
                msg).create();
        JOptionPane.showMessageDialog(null, "Reminder sent successfully");
    }
}
