package com.javabydeveloper.lombok;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class UserData extends Person {
	
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate lastUpdated;
    private boolean active;
    
}
