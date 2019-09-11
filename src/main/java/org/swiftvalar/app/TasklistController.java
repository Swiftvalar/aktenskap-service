package org.swiftvalar.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.swiftvalar.app.TasklistCard;

@RestController
public class TasklistController {

    @GetMapping("/getActiveCards")
    public List<TasklistCard> getActiveCards() {
        ArrayList<TasklistCard> activeCards = new ArrayList<TasklistCard>();
        TasklistCard newCard = new TasklistCard(1, "Card Title", "todoColumn", "New Card 1 text");

        activeCards.add(newCard);
        return activeCards;
    }

    @PostMapping("/saveActiveCards/")
    @ResponseBody
    public String saveActiveCards(@RequestParam String activeCards) {
        return "save not yet implemented";
    }

    @RequestMapping("/getArchivedCards/")
    public List<TasklistCard> getArchivedCards() {
        ArrayList<TasklistCard> archivedCards = new ArrayList<TasklistCard>();
        TasklistCard archivedCard = new TasklistCard(1, "Archived Card Title", "todoColumn", "Archived Card 1 text");

        archivedCards.add(archivedCard);
        return archivedCards;
    }

    @PostMapping("/saveArchivedCards/")
    @ResponseBody
    public String saveArchivedCards(@RequestParam String archivedCards) {
        return "save not yet implemented";
    }
}