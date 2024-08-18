package tobyspring.hellospring2024;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentService {

	private WebApiExRateProvider exRateProvider;

	public PaymentService() {
		exRateProvider = new WebApiExRateProvider();
	}

	public Payment prepare(
			Long orderId,
			String currency,
			BigDecimal foreignCurrentAmount
	) throws IOException {
		BigDecimal exRate = exRateProvider.getWebExRate(currency);

		BigDecimal convertedAmount = foreignCurrentAmount.multiply(exRate);
		LocalDateTime validUntil = LocalDateTime.now().plusMinutes(30);
		
		return new Payment(
				orderId, currency, foreignCurrentAmount, exRate, convertedAmount, validUntil
		);
	}
}
