package com.benchelbikh.architecture.buisness;

import com.benchelbikh.architecture.models.City;

public class TarifService implements servicesTarif {

    @Override
    public int calculateTarif(City city, int volume) {

        City.Tarif tarif = city.new Tarif(volume);
        return 0;
    }
}
