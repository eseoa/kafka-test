package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.request.StartScoringClientRequest;
import org.example.mapper.ClientMapper;
import org.example.model.Client;
import org.example.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public UUID startScoring(StartScoringClientRequest startScoringClientRequest) {
        clientRepository.findByPassportNumber(startScoringClientRequest.passportNumber()).ifPresent(v -> {
            throw new RuntimeException("Client already scoritsya");
        });

        Client client = clientMapper.toClient(startScoringClientRequest);
        return clientRepository.save(client).getExternalId();
    }
}
