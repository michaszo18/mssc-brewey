package pl.msblog.msscbrewery.web.service;

import org.springframework.stereotype.Service;
import pl.msblog.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .build();
    }
}
