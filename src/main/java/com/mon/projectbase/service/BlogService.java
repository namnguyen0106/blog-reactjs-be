package com.mon.projectbase.service;

import com.mon.projectbase.dto.BlogDTO;
import com.mon.projectbase.mapper.BlogMapper;
import com.mon.projectbase.model.Blog;
import com.mon.projectbase.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService extends BaseService<BlogRepository, BlogDTO, Blog> {
    @Autowired
    private BlogRepository repository;
    @Autowired
    private BlogMapper mapper;

    @Override
    public BlogDTO create(BlogDTO dto) {
        Blog blog = mapper.toEntity(dto);
        repository.save(blog);
        return dto;
    }

    @Override
    public BlogDTO update(BlogDTO dto) {
        Blog blog = new Blog();
        mapper.updateFromDTO(dto, blog);
        repository.save(blog);
        return dto;
    }

    @Override
    public Optional<BlogDTO> getDetails(Long id) {
        return Optional.ofNullable(mapper.toDto(repository.findById(id).get()));
    }

    @Override
    public BlogDTO delete(BlogDTO dto) {
        return null;
    }

    @Override
    public List<BlogDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

    public BlogDTO changeStatus(Long id, int status) {
        Blog blog = repository.findById(id).get();
        blog.setStatus(status);
        return mapper.toDto(repository.save(blog));
    }
}
