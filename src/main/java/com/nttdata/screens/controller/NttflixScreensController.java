package com.nttdata.screens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.nttdata.screens.obj.RequestScreen;
import com.nttdata.screens.obj.ResponseScreen;
import com.nttdata.screens.obj.ScreenData;
import com.nttdata.screens.services.NttflixScreensService;

@Controller
public class NttflixScreensController {
    
    @Autowired
    private NttflixScreensService nttflixScreensService;
    
    @PostMapping(value = "/api/screens")																	// CAMBIAR CODIGO DE ERROR
    public ResponseEntity<ResponseScreen> addScreen(@RequestBody RequestScreen requestScreen) {
        ResponseScreen responseScreen;
        try {
            responseScreen = nttflixScreensService.addScreen(requestScreen);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Screen ya existe", e);
        }
        return new ResponseEntity<ResponseScreen>(new ResponseScreen(requestScreen.getScreenData().getId().toString() + " created succesfully", requestScreen.getScreenData()), HttpStatus.OK);
    }

   @GetMapping(value = "/api/screens")
    public ResponseEntity<List<ScreenData>> getScreens(@RequestBody RequestScreen requestScreen) {     
       List<ScreenData> screens = nttflixScreensService.getScreens(requestScreen);
       return new ResponseEntity<>(screens, HttpStatus.OK);
   }

   @GetMapping(value = "/api/screens/number")
    public ResponseScreen getScreensNumber(@RequestBody RequestScreen requestScreen) {
        return nttflixScreensService.getScreensNumber(requestScreen);
    }

   @DeleteMapping(value = "/api/screens")
    public ResponseEntity<ResponseScreen> deleteScreen(@RequestBody RequestScreen requestScreen) {
        ResponseScreen responseScreen = null;
        try {
            responseScreen = nttflixScreensService.deleteScreen(requestScreen);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Screen no existe", e);
        }
        return new ResponseEntity<ResponseScreen>(new ResponseScreen(requestScreen.getScreenData().getId().toString() + " deleted succesfully", requestScreen.getScreenData()), HttpStatus.OK);
    }

    @PutMapping(value = "/api/screens")
    public ResponseEntity<ResponseScreen> updateScreen(@RequestBody RequestScreen requestScreen) {
        ResponseScreen responseScreen = null;
        try {
            responseScreen = nttflixScreensService.updateScreen(requestScreen);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Screen no existe", e);
        }
        return new ResponseEntity<ResponseScreen>(new ResponseScreen(requestScreen.getScreenData().getId().toString() + " updated succesfully", requestScreen.getScreenData()), HttpStatus.OK);
    }
}
