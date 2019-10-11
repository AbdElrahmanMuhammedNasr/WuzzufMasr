package springangular.demo.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springangular.demo.ZModel.Messages;

@RestController
@RequestMapping(value = {"/messanger"})
public class chatController {

    @MessageMapping("/chat.register")
    @SendTo("/secondOne/public")
    public Messages register(@Payload Messages messages, SimpMessageHeaderAccessor headerAccessor){
        headerAccessor.getSessionAttributes().put("username",messages.getSender());
        return messages;
    }

    @MessageMapping("/chat.send")
    @SendTo("/secondOne/public")
    public Messages sendMessage(@Payload Messages messages){
        return messages;
    }

}
