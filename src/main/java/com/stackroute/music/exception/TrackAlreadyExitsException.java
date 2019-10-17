package com.stackroute.music.exception;

public class TrackAlreadyExitsException extends  RuntimeException{

    public TrackAlreadyExitsException(String message) {
        super(message);
    }
}
