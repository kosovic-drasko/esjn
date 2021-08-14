package tenderi.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlleWebSocret {

    @Autowired
    private SimpMessagingTemplate template;

    // For specific user
    @GetMapping("/sendNotification")
    public String sendNotification() {
        template.convertAndSendToUser("swarup", "/reply", "swaruprr");
        return "Notification send succefully";
    }
}
