package com.dozie.videochattingapp.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String username;
    private String email;
    private String status;
    private String password;
}
