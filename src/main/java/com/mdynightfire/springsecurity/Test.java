package com.mdynightfire.springsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author mdynightfire
 */
public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
        System.out.println(encode.encode("1234"));
    }
}
