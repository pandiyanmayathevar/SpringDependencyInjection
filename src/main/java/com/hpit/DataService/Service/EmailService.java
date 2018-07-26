package com.hpit.DataService.Service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.inject.Named;
//import org.springframework.stereotype.Service;

//@Service
//@Component
@Named
@Qualifier("Email")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EmailService implements MessageService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
        public boolean sendMessage(String msg){
            //System.out.println("EmailService = " + msg);
            logger.info("EmailService =  -> {}",msg);
            return true;
        }

}
