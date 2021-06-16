package pl.msblog.msscbrewery.web.service;

import pl.msblog.msscbrewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {

    BeerDto getBeerById(UUID beerId);

}
