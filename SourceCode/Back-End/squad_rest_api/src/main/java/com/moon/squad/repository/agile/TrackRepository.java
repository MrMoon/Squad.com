package com.moon.squad.repository.agile;

import com.moon.squad.model.agile.Track;
import com.moon.squad.repository.shared.CRUDRepository;
import com.moon.squad.shared.ApplicationConstants;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin (origins = ApplicationConstants.LOCALHOST_4200)
public interface TrackRepository extends CRUDRepository<Track> {
    List<Track> findAllByOrderByEvaluation();
}
