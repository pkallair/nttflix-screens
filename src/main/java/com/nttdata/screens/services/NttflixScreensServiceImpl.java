package com.nttdata.screens.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.screens.NttflixScreensRepository.NttflixScreensRepository;
import com.nttdata.screens.obj.RequestScreen;
import com.nttdata.screens.obj.ResponseScreen;
import com.nttdata.screens.obj.ScreenData;

@Service
public class NttflixScreensServiceImpl implements NttflixScreensService {
	
	@Autowired
	NttflixScreensRepository nttflixScreensRepository;
	
	public ResponseScreen addScreen(RequestScreen requestScreen) {
		// Implementar
		return null;
	}

	public ResponseScreen getScreensNumber(RequestScreen requestScreen) {
		// Implementar
		return null;
	}

	public ResponseScreen deleteScreen(RequestScreen requestScreen) {
		// Implementar
		return null;
	}

	public List<ScreenData> getScreens(RequestScreen requestScreen) {
		// Implementar
		return null;
	}

	public ResponseScreen updateScreen(RequestScreen requestScreen) {
		// Implementar
		return null;
	}
}
