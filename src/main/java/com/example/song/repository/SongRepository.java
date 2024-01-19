package com.example.song.repository;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.model.*;

public interface SongRepository {
    ArrayList<Song> getSongs();

    Song getSongById(int songId);

    Song addSong(Song newSong);

    Song updateSong(int songId, Song song);

    void deleteSong(int songId);
}