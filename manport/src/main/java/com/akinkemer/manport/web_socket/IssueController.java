package com.akinkemer.manport.web_socket;

import com.akinkemer.manport.enums.app.BusinessArea;
import com.akinkemer.manport.enums.job.JobStatus;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Map;
import java.util.Random;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class IssueController {

    private SimpMessageSendingOperations messagingTemplate;

    @Autowired
    public IssueController(SimpMessagingTemplate messagingTemplate){
        this.messagingTemplate=messagingTemplate;
    }

    @SubscribeMapping("/issue")
    public void getIssue(Principal principal) throws InterruptedException {
       for(int i=0;i<2;i++){
           messagingTemplate.convertAndSend("/issue",new Issue(
                   1L,
                   2L,
                   3L,
                   4L,
                   JobStatus.HIGH));
       }
    }
}
