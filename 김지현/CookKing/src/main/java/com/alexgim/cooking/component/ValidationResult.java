package com.alexgim.cooking.component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Component
@Getter
@NoArgsConstructor
public class ValidationResult {
    boolean flag;
    StringBuilder sb;

    public boolean result(BindingResult bindingResult) {
        flag = true;
        if(bindingResult.hasErrors()){
            sb = new StringBuilder();
            flag = false;
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError error = (FieldError) objectError;
                String field = error.getField();
                String defaultMessage = error.getDefaultMessage();

                sb.append("Field : " + field).append(", message : " + defaultMessage).append("\n");
            });
        }
        return flag;
    }
}
