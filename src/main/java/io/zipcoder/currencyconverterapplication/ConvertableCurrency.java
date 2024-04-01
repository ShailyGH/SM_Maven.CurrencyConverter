package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    CurrencyType getType();
    default Double convert(CurrencyType currencyType)
    {
        // Calculate the exchange rates between any two arbitrary types of currency
        Double calculation = currencyType.getRate()/this.getType().getRate();
        return calculation;
    }
}
