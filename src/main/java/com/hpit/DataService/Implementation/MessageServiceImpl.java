package com.hpit.DataService.Implementation;

import com.hpit.DataService.Service.MessageService;
import javafx.beans.NamedArg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.stereotype.Service;

//@Service
//Spring IOC Container manages the life cycle of the bean
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class MessageServiceImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("Email")
    public MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean SendMEssage(String Msg){
        messageService.sendMessage(Msg);
        //System.out.println("messageService instance -> " + messageService);
        logger.info("MessageService Instance -> {}",messageService);
        return true;
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("MessageServiceImpl - Pre Destroy called");
    }

    @PostConstruct
    public void constrct(){
        logger.info("MessageServiceImpl - Post Construct called");
    }


}
