package com.hpit.DataService.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Service
@Component
//@Primary
@Qualifier("SMS")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SmsService implements MessageService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
        public boolean sendMessage(String msg){
            //System.out.println("SmsService = " + msg);
            logger.info("SmsService =  -> {}",msg);
            return true;
        }

}
