package com.cmd.guidebook.controller;

import com.cmd.guidebook.entity.Page;
import com.cmd.guidebook.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @Autowired
    private PageService pageService;

    @GetMapping("/page/{id}")
    public String viewPage(@PathVariable Long id, Model model) {
        Page page = pageService.getPage(id);
        model.addAttribute("page", page);
        return "";
    }

    @PostMapping("/page")
    public String createPage(@ModelAttribute("page") Page page) {
        pageService.createPage(page);
        return "";
    }

    @PostMapping("/page/update/{id}")
    public String updatePage(@PathVariable Long id, @ModelAttribute("page") Page page) {
        pageService.updatePage(id, page);
        return "";
    }

    @GetMapping("/page/delete/{id}")
    public String deletePage(@PathVariable Long id) {
        pageService.deletePage(id);
        return "";
    }
}
