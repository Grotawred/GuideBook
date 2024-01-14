package com.cmd.guidebook.service;

import com.cmd.guidebook.entity.Page;
import com.cmd.guidebook.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PageService {

    @Autowired
    private PageRepository pageRepository;

    public Page getPage(Long id){
        return pageRepository.findById(id).orElse(null);
    }

    public void createPage(Page page){
        pageRepository.save(page);
    }

    public void updatePage(Long id, Page page) {
        Page existPage = pageRepository.findById(id).orElse(null);
        if (existPage != null) {
            existPage.setName(page.getName());
            existPage.setContent(page.getContent());
            pageRepository.save(existPage);
        }else System.out.println("page does not exist");
    }

    public void deletePage(Long id){
        pageRepository.deleteById(id);
    }
}
