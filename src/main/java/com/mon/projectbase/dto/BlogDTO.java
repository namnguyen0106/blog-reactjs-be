package com.mon.projectbase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDTO extends BaseDTO {
    private Long id;
    private String title;
    private String avatarUrl;
    private int status;
}
