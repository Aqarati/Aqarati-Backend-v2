package com.aqarati.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@Document("Users")
@AllArgsConstructor
public class UserApp  {
    @MongoId
    private String id;
    private String email;
    private String username;
    @JsonIgnore
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<Long> favouriteProperty;
    private String imageUrl;
    @Builder.Default
    private boolean isEmailVerified=false;
    @Builder.Default
    private boolean isPhoneNumberVerified=false;
    @JsonIgnore
    private List<String> role;
    @JsonIgnore
    private Date createdDate;


    public UserApp() {
        this.createdDate = new Date();
        this.favouriteProperty = new ArrayList<>();
    }

    public UserApp(String email, String password) {
        this();
        this.email = email;
        this.password = password;
    }

    public UserApp(String email, String password, String firstName, String lastName) {
        this(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

