package com.javabydeveloper.lombok;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter @Setter
public class User {
	
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate lastUpdated;
    private boolean active;
    
}
