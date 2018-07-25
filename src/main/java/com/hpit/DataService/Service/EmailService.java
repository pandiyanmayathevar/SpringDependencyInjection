package com.hpit.DataService.Service;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Email")
public class EmailService implements MessageService {

        public boolean sendMessage(String msg){
            System.out.println("EmailService = " + msg);
            return true;
        }

}
