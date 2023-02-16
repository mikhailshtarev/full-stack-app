package com.shtarev.FullApp;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class FullAppApplicationTests {

    @Test
    void getEncodePasssword() {
        String pass = "admin";
        int str = 10;
        BCryptPasswordEncoder bCryptPasswordEncoder =
                new BCryptPasswordEncoder(str);
        String encodedPassword = bCryptPasswordEncoder.encode(pass);
        System.out.println(encodedPassword);
    }

}
