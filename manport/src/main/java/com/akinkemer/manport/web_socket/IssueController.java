package com.akinkemer.manport.web_socket;

import com.akinkemer.manport.enums.job.JobStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.security.Principal;

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
