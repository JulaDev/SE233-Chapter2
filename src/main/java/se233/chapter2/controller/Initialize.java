package se233.chapter2.controller;

import se233.chapter2.Launcher;
import se233.chapter2.model.Currency;
import se233.chapter2.model.CurrencyEntity;
import java.util.ArrayList;

public class Initialize {
    public static void initialize_app(){
        Currency c = new Currency("USD");
        ArrayList<CurrencyEntity> c_list = FetchData.fetch_range(c.getShortCode(),6);
        c.setHistorical(c_list);
        c.setCurrent(c_list.get(c_list.size()-1));
        ArrayList<Currency> currencyList = new ArrayList<>();
        currencyList.add(c);
        Launcher.setCurrency(currencyList);
    }
}
