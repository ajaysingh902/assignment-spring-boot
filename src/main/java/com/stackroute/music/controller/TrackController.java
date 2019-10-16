package com.stackroute.music.controller;

import com.stackroute.music.domain.Track;
import com.stackroute.music.exception.TrackAlreadyExitsException;
import com.stackroute.music.service.Trackservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class TrackController {
//    private UserService userService;
    private Trackservice trackservice;

    public TrackController(Trackservice trackservice) {
        this.trackservice = trackservice;
    }

    //    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
    @PostMapping("track")
    public ResponseEntity<?> saveUser(@RequestBody Track track)
    {
        ResponseEntity responseEntity;
        try {
//            userService.saveUser(user);
            trackservice.saveTrack(track);

            responseEntity=new ResponseEntity<String>("successfully created", HttpStatus.ACCEPTED);
            return responseEntity;

        }
        catch(Exception e)
        {

            responseEntity=new ResponseEntity<String>(e.getMessage(), HttpStatus.ACCEPTED);
        }
        return responseEntity;

    }
//    @PostMapping("delete")
    @DeleteMapping("track")
    public ResponseEntity<?> deleteTrack(@RequestBody Track track)
    {
        ResponseEntity responseEntity;
        try {
//            userService.saveUser(user);
            trackservice.deleteTrack(track);

            responseEntity=new ResponseEntity<String>("successfully deleted", HttpStatus.ACCEPTED);
            return responseEntity;

        }
        catch(TrackAlreadyExitsException e)
        {

            responseEntity=new ResponseEntity<String>(e.getMessage(), HttpStatus.ACCEPTED);
        }
        return responseEntity;

    }
    @GetMapping("track")
    public ResponseEntity<?> getAllUsers()
    {
        return new ResponseEntity<List<Track>>(trackservice.getTrack(),HttpStatus.OK);
    }
    @GetMapping("/getname")
    public ResponseEntity<?> getTrackById(@RequestParam int i)
    {
        return new ResponseEntity<Track>(trackservice.getTrackById(i),HttpStatus.OK);
    }
}
