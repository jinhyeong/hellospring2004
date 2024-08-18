package tobyspring.hellospring2024;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

@Component
public class SimpleExRateProvider implements ExRateProvider {
	
	@Override
	public BigDecimal getExRate(String currency) throws IOException {
		if (currency.equals("USD")) {
			return new BigDecimal("1000");
		}
		throw new IllegalArgumentException("Unsupported currency: " + currency);
	}
}
