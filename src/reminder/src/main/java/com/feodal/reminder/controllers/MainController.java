package com.feodal.reminder.controllers;

import com.feodal.reminder.models.Link;
import com.feodal.reminder.repo.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    LinkRepository linkRepository;

    @GetMapping("/")
    public String index(@RequestParam(name = "message", defaultValue = "", required = false) String error,  Model model) {
        switch (error) {
            case "sameLink" -> model.addAttribute("message", "A link with this name already exists, please try again.");
            case "successAdd" -> model.addAttribute("message", "The link has been successfully added to the list.");
            case "successDelete" -> model.addAttribute("message", "The link has been deleted.");
            default -> model.addAttribute("message", "");
        }
        Iterable<Link> links = linkRepository.findAll();
        model.addAttribute("links", links);
        return "index";
    }

    @PostMapping("/")
    public String post(@RequestParam String longLink, @RequestParam String shortLink) {
        Link linkFind = linkRepository.findByShortLink(shortLink);
        if (linkFind == null) {
            Link newLink = new Link();
            newLink.setLongLink(longLink);
            newLink.setShortLink(shortLink);
            linkRepository.save(newLink);
            return "redirect:/?message=successAdd";
        } else {
            return "redirect:/?message=sameLink";
        }
    }
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        linkRepository.findById(id).ifPresent(linkToDelete -> linkRepository.delete(linkToDelete));
        return "redirect:/?message=successDelete";
    }
}
