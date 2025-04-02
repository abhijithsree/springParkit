package com.carparking.project;

import com.carparking.project.service.AdruinoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Tag(name = "Test Controller", description = "Example API for Swagger integration")
public class AdruinoController {


    @Autowired
    AdruinoService adruinoService;


    @PostMapping(value = "/updateSensor", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> updateSensorData(@RequestParam Map<String, String> requestParams) throws Exception {
        String response = adruinoService.getSlot(requestParams);
        System.out.println(response);
        return ResponseEntity.ok(response.trim());  // Trim extra spaces
    }
}