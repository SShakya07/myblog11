package com.myblog.myblog11;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLogIN {

    public static void main(String[] args) {
        List<Login> logins = Arrays.asList(
            new Login("mike","testing"),
            new Login("stallin","testing"),
            new Login("adam","testing")



        );
        //System.out.println(logins);

        List<LoginDto1> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
        System.out.println(dtos);


    }
   static LoginDto1 mapToDto(Login login){
        LoginDto1 dto  =  new LoginDto1();
        dto.setUsername(login.getUsername());
        dto.setPassword(login.getPassword());
        return dto;
    }
}
