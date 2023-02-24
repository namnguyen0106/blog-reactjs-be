package com.mon.projectbase.controller;

import com.mon.projectbase.dto.BlogDTO;
import com.mon.projectbase.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
@CrossOrigin(origins = "*")
public class BlogController extends BaseController<BlogService, BlogDTO> {
}
