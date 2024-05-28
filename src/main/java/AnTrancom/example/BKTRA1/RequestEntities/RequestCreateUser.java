package com.example.TranThiVIetAn_BtapKtra.RequestEntities;

import com.example.TranThiVIetAn_BtapKtra.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestCreateUser {

    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
}
