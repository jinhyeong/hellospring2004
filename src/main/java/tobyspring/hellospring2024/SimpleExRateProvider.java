package tobyspring.hellospring2024;

import java.io.IOException;
import java.math.BigDecimal;

public class SimpleExRateProvider {
	BigDecimal getExRate(String currency) throws IOException {
		if (currency.equals("USD")) {
			return new BigDecimal("1000");
		}
		throw new IllegalArgumentException("Unsupported currency: " + currency);
	}
}
