package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    CurrencyType getType();
    default Double convert(CurrencyType currencyType)
    {
        Double calculation = currencyType.getRate()/this.getType().getRate();
        return calculation;
    }
}
