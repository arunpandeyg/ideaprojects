package com.exam.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserNotFoundException extends RuntimeException {
     String userName;
     String fieldName;
     long fieldValue;

    public UserNotFoundException(String noUserFound) {

    }


    @ExceptionHandler
    public void ExceptionHandler(String userName, String fieldName, long fieldValue) {
        /*super(String.format("%s not found with %s : %s",  userName, fieldName, fieldValue));*/
        this.userName = userName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;

    }


}
