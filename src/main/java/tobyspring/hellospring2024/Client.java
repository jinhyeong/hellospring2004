package tobyspring.hellospring2024;

import java.io.IOException;
import java.math.BigDecimal;

public class Client {
	public static void main(String[] args) throws IOException {
		PaymentService paymentService = new WebApiExRatePaymentService();
		Payment payment = paymentService.prepare(100L, "USD", new BigDecimal("50.7"));

		System.out.println("payment = " + payment);
	}
}
