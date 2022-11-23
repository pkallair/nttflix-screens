package com.nttdata.screens.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.screens.obj.RequestScreen;
import com.nttdata.screens.obj.ResponseScreen;
import com.nttdata.screens.obj.ScreenData;

@Service
public interface NttflixScreensService {

	public ResponseScreen addScreen(RequestScreen requestScreen);

	public ResponseScreen getScreensNumber(RequestScreen requestScreen);

	public ResponseScreen deleteScreen(RequestScreen requestScreen);

	public List<ScreenData> getScreens(RequestScreen requestScreen);

	public ResponseScreen updateScreen(RequestScreen requestScreen);

}
