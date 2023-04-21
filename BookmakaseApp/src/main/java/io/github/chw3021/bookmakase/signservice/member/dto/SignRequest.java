package io.github.chw3021.bookmakase.signservice.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SignRequest{

    private Long id;

    private String account;

    private String password;

    private String nickname;

    private String name;

    private String email;
    

}