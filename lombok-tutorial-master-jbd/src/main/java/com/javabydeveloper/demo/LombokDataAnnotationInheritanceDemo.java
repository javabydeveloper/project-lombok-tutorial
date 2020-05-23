package com.javabydeveloper.demo;

import java.time.LocalDate;

import com.javabydeveloper.lombok.Employee;
import com.javabydeveloper.lombok.UserData;

public class LombokDataAnnotationInheritanceDemo {

public static void main(String[] args) {
    	
        Employee user1 = new Employee();
        user1.setId(1L);
        user1.setFirstName("Peter");
        user1.setLastName("Milanovich");
        user1.setActive(true);
        user1.setUsername("peterm");
        user1.setLastUpdated(LocalDate.now());
        
        System.out.println("Id : "+user1.getId());
        System.out.println("Username : "+user1.getUsername());
        System.out.println("First Name : "+user1.getFirstName());
        
        //toString()
        System.out.println(user1.toString());
        
        //hashcode()
        System.out.println("User1 Hash Code: "+ user1.hashCode());
        
        //to test eqauls()
        UserData user2 = new UserData();
        user2.setId(1L);
        user2.setFirstName("Peter");
        user2.setLastName("Milanovich");
        user2.setActive(true);
        user2.setUsername("peterm");
        user2.setLastUpdated(LocalDate.now());
        
        //hashcode()
        System.out.println("User2 Hash Code: "+ user2.hashCode());
        
        System.out.println("User1 and User2 are same? "+user1.equals(user2));
        
    } 
}
