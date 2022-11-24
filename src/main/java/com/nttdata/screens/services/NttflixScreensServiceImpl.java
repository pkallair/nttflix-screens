package com.nttdata.screens.services;

import java.util.List;
import java.util.Optional;

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
	
	// Añade una entrada a la BD si esta no existe aún.
	@Override
	public ResponseScreen addScreen(RequestScreen requestScreen) {
		Optional<ScreenData> resultado = nttflixScreensRepository.findById(requestScreen.getScreenData().getId());
		if (resultado.isEmpty()) nttflixScreensRepository.save(requestScreen.getScreenData());
		else System.out.println("Error: ya existe una entrada con id = " + requestScreen.getScreenData().getId().toString());
		return null;
	}

	// Devuelve el numero de entradas de la BD
	@Override
	public ResponseScreen getScreensNumber(RequestScreen requestScreen) {
		Long screenNumber = (long)nttflixScreensRepository.findAll().size();
		// Devolvemos un nuevo ResponseScreen con el numero como "message" y un ScreenData vacio
		return new ResponseScreen(screenNumber.toString(), new ScreenData());
	}
	
	// Elimina una entrada de la BD si esta existe
	@Override
	public ResponseScreen deleteScreen(RequestScreen requestScreen) {
		Optional<ScreenData> resultado = nttflixScreensRepository.findById(requestScreen.getScreenData().getId());
		if (resultado.isEmpty()) nttflixScreensRepository.delete(requestScreen.getScreenData());
		else System.out.println("Error: no existe ninguna entrada con id = " + requestScreen.getScreenData().getId().toString());
		return null;
	}

	// Devuelve una lista con todas las entradas existentes en la BD
	@Override
	public List<ScreenData> getScreens(RequestScreen requestScreen) {
		return nttflixScreensRepository.findAll();
	}

	// Actualiza, si existe, una entrada de la BD
	@Override
	public ResponseScreen updateScreen(RequestScreen requestScreen) {
		Optional<ScreenData> resultado = nttflixScreensRepository.findById(requestScreen.getScreenData().getId());
		if (!resultado.isEmpty()) nttflixScreensRepository.save(requestScreen.getScreenData());
		else System.out.println("Error: no existe ninguna entrada con id = " + requestScreen.getScreenData().getId().toString());
		return null;
	}
}
