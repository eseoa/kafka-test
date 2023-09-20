package org.example.mapper;

import org.example.dto.request.StartScoringClientRequest;
import org.example.model.Client;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        builder = @Builder(disableBuilder = true),
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ClientMapper {

    @Mapping(target = "externalId", expression = "java(java.util.UUID.randomUUID())")
    Client toClient(StartScoringClientRequest startScoringClientRequest);
}
