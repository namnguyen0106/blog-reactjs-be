package com.mon.projectbase.dto;

import lombok.Data;

@Data
public class UserDTO extends BaseDTO {
    private String userName;
    private String password;
}
