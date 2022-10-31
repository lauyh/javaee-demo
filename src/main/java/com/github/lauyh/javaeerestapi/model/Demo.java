package com.github.lauyh.javaeerestapi.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class Demo {
    @Email @NotNull
    String email;
}
