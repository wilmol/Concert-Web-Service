package nz.ac.auckland.concert.service.services;

import nz.ac.auckland.concert.common.dto.ConcertDTO;
import nz.ac.auckland.concert.service.domain.Concert;
import nz.ac.auckland.concert.service.domain.Performer;

import java.util.stream.Collectors;


class ConcertMapper {

    static ConcertDTO toDto(Concert concert) {
        return new ConcertDTO(
                concert.getId(),
                concert.getTitle(),
                concert.getDates(),
                concert.getTariff(),
                concert.getPerformers().stream().map(Performer::getId).collect(Collectors.toSet())
        );
    }


}
