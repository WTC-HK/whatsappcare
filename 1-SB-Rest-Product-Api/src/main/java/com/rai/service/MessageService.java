package com.rai.service;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.net.URI;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MessageService {
	public static final String ACCOUNT_SID = "ACf436275338e23cd4ea3746dced49e211";
    //public static final String AUTH_TOKEN = "15967117b745ee8f8d3f8fe9d596bf1b";
	public static final String AUTH_TOKEN ="********************";
    public static final String MOBLIE_NUMBER="whatsapp:+";
	
	public void sentMessage(final String mobileNumber) {
    // Find your Account Sid and Token at twilio.com/console
    
   // public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(MOBLIE_NUMBER+mobileNumber),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Hello Puneet ! How i Help u ?"+mobileNumber)
            .create();
        System.out.println(message.getSid());
    //}
	}
}
