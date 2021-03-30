package com.akinkemer.manport.exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // Exception Handlers Here
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFoundException(Exception ex){

        ApiError apiError = new ApiError.
                Builder()
                .withMessage(ex.getMessage())
                .withHttpStatus(HttpStatus.NOT_FOUND)
                .withCreatedAt()
                .build();

        return new ResponseEntity<>(apiError,apiError.getHttpStatus());
    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> handleHttpMessageNotReadableException(Exception ex){

        ApiError apiError = new ApiError.
                Builder()
                .withMessage(ex.getMessage())
                .withHttpStatus(HttpStatus.NOT_FOUND)
                .withCreatedAt()
                .build();

        return new ResponseEntity<>(apiError,apiError.getHttpStatus());
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgumentException(Exception ex){

        ApiError apiError = new ApiError.
                Builder()
                .withMessage(ex.getMessage())
                .withHttpStatus(HttpStatus.BAD_REQUEST)
                .withCreatedAt()
                .build();

        return new ResponseEntity<>(apiError,apiError.getHttpStatus());
    }
    @ExceptionHandler(HttpMessageNotWritableException.class)
    public ResponseEntity<Object> handleHttpMessageNotWritableException(Exception ex){

        ApiError apiError = new ApiError.
                Builder()
                .withHttpStatus(HttpStatus.BAD_REQUEST)
                .withMessage(ex.getMessage())
                .withCreatedAt()
                .build();

        return new ResponseEntity<>(apiError,apiError.getHttpStatus());
    }

    // Generalized Exceptions
    /*
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericException(Exception exception){
        ApiError apiError = new ApiError.
                Builder()
                .withMessage("Some Error Occurred")
                .withHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                .withCreatedAt()
                .build();

        return new ResponseEntity<>(apiError,apiError.getHttpStatus());
    }*/

}