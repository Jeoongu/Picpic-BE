package com.likelion.picpic.repository;

import com.likelion.picpic.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
    Optional<Photo> findByUrl(String url);
}
