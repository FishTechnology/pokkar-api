package org.cana.resources.roundpoint.mappers;

import org.cana.resources.roundpoint.models.RoundPointModel;
import org.cana.services.roundpoint.dtos.RoundPointDto;

public interface RoundPointResourceMapper {
    RoundPointDto mapRoundPointDto(String gameId, String playerId, String lapId, RoundPointModel roundPointModel);
}
