package org.cana.services.roundpoint.errorcodes;

import lombok.Data;
import org.cana.commons.BaseErrorCode;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Data
public class RoundPointErrorCodes extends BaseErrorCode {

    private String gameRoundIdNotFound = "Pokkar.Api.{" + getApiControllerName() + "}.{" + getHttpMethod() + "}.GameRoundId.NotFound";
    private String gamePlayerIdNotFound = "Pokkar.Api.{" + getApiControllerName() + "}.{" + getHttpMethod() + "}.GamePlayerId.NotFound";
    private String getGameIdNotFound = "Pokkar.Api.{" + getApiControllerName() + "}.{" + getHttpMethod() + "}.GameId.NotFound";

    public static final String GamePointIsNull = "Pokkar.Api.{0}.{1}.GamePoint.IsNull";
    public static final String GamePointIsEmpty = "Pokkar.Api.{0}.{1}.GamePoint.IsEmpty";
    public static final String GamePointIsNotAllowedOne = "Pokkar.Api.{0}.{1}.GamePoint.IsNotAllowedOne";
}
