package com.nttdata.screens.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.screens.obj.RequestScreen;
import com.nttdata.screens.obj.ResponseScreen;
import com.nttdata.screens.obj.ScreenData;
import com.nttdata.screens.repository.NttflixScreensRepository;

@Service
public class NttflixScreensServiceImpl implements NttflixScreensService {
	
	@Autowired
	private NttflixScreensRepository nttflixScreensRepository;
	
	@Override
	public ResponseScreen addScreen(RequestScreen requestScreen) {
		nttflixScreensRepository.save(requestScreen.getScreenData());
		return null;
	}

	@Override
	public ResponseScreen getScreensNumber(RequestScreen requestScreen) {
		Long screenNumber;
		screenNumber = (long)nttflixScreensRepository.findAll().size();
		return null;
	}
	
	@Override
	public ResponseScreen deleteScreen(RequestScreen requestScreen) {
		nttflixScreensRepository.delete(requestScreen.getScreenData());
		return null;
	}

	@Override
	public List<ScreenData> getScreens(RequestScreen requestScreen) {
		// Implementar
		return nttflixScreensRepository.findAll();
	}

	@Override
	public ResponseScreen updateScreen(RequestScreen requestScreen) {
		nttflixScreensRepository.save(requestScreen.getScreenData());		
		return null;
	}
}
