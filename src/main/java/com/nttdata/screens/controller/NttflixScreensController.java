package com.nttdata.screens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nttdata.screens.obj.RequestScreen;
import com.nttdata.screens.obj.ResponseScreen;
import com.nttdata.screens.obj.ScreenData;
import com.nttdata.screens.services.NttflixScreensService;

@Controller
public class NttflixScreensController {
	
	@Autowired
	NttflixScreensService nttflixScreensService;
	
	@PostMapping(value = "/api/screens") 
	public ResponseScreen addScreen(@RequestBody RequestScreen requestScreen) {
		
		return nttflixScreensService.addScreen(requestScreen);
	}

	@GetMapping(value = "/api/screens") 
	public List<ScreenData> getScreens(@RequestBody RequestScreen requestScreen) {
		
		return nttflixScreensService.getScreens(requestScreen);
	}

	@GetMapping(value = "/api/screens/number") 
	public ResponseScreen getScreensNumber(@RequestBody RequestScreen requestScreen) {
		
		return nttflixScreensService.getScreensNumber(requestScreen);
	}

	@DeleteMapping(value = "/api/screens") 
	public ResponseScreen deleteScreen(@RequestBody RequestScreen requestScreen) {
		
		return nttflixScreensService.deleteScreen(requestScreen);
	}

	@PutMapping(value = "/api/screens") 
	public ResponseScreen updateScreen(@RequestBody RequestScreen requestScreen) {
		
		return nttflixScreensService.updateScreen(requestScreen);
	}
}
