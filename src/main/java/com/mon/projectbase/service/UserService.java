package com.mon.projectbase.service;

import com.mon.projectbase.dto.UserDTO;
import com.mon.projectbase.model.Users;
import com.mon.projectbase.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService extends BaseService<UserRepository, UserDTO, Users> {
    @Override
    public UserDTO create(UserDTO dto) {
        return null;
    }

    @Override
    public UserDTO update(UserDTO dto) {
        return null;
    }

    @Override
    public Optional<UserDTO> getDetails(Long id) {
        return Optional.empty();
    }

    @Override
    public UserDTO delete(UserDTO dto) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }
}
