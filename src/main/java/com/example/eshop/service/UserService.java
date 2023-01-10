package com.example.eshop.service;

import com.example.eshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean save(UserDTO userDTO);
}
