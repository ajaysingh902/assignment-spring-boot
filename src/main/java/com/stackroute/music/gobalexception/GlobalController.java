package com.stackroute.music.gobalexception;

import com.stackroute.music.exception.TrackAlreadyExitsException;
import org.apache.juli.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

@RestControllerAdvice
public class GlobalController {
//    private Log log= LogFactory.getLog(GlobalController.class);
//    private Log logger= (Log) LogFactory.getLog(GlobalController.class);
//    @ExceptionHandler(TrackAlreadyExitsException.class)
//   public String handle
//    @ResponseBody
    @ExceptionHandler(TrackAlreadyExitsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String employeeNotFoundHandler(TrackAlreadyExitsException ex) {
        return ex.getMessage()+"123123";
    }
}
