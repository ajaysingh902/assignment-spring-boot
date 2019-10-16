package com.stackroute.music.service;

import com.stackroute.music.domain.Track;
import com.stackroute.music.exception.TrackAlreadyExitsException;
import com.stackroute.music.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Trackservice {
    TrackRepository trackRepository;
    @Autowired
    public Trackservice(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
    public Track saveTrack(Track track) throws TrackAlreadyExitsException
    {
        if(trackRepository.existsById(track.getId()))
        {
            throw new TrackAlreadyExitsException("Track already exists exception");

        }
        Track savedTrack=trackRepository.save(track);
        if(savedTrack==null)
        {
            throw new TrackAlreadyExitsException("Track already exists exception");

        }
        return savedTrack;
    }
    public List<Track> getTrack()
    {
        return trackRepository.findAll();
    }
    public void deleteTrack(Track track)
    {
        trackRepository.delete(track);
    }
    public Track getTrackById(int i)
    {

        Track track=trackRepository.findbytrackid(i);
        return  track;
    }


}
