package com.hpit.DataService.Service;


import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Qualifier("SMS")
public class SmsService implements MessageService {

        public boolean sendMessage(String msg){
            System.out.println("SmsService = " + msg);
            return true;
        }

}
