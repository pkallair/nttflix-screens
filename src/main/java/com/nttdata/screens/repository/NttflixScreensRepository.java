package com.nttdata.screens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.screens.obj.ScreenData;

@Repository
public interface NttflixScreensRepository extends JpaRepository<ScreenData, Long>{
	//Bla bla bla
}
