package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.request.StartScoringClientRequest;
import org.example.service.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("public/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public UUID startScoring(@RequestBody StartScoringClientRequest startScoringClientRequest) {
        return clientService.startScoring(startScoringClientRequest);
    }

}
