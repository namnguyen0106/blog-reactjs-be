package com.mon.projectbase.mapper;

import com.mon.projectbase.dto.BlogDTO;
import com.mon.projectbase.model.Blog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface BlogMapper extends EntityMapper<BlogDTO, Blog> {
}
