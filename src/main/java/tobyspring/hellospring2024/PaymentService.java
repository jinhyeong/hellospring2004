package tobyspring.hellospring2024;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentService {
	public Payment prepare(
			Long orderId,
			String currency,
			BigDecimal foreignCurrentAmount
	) {
		// 환율 가져오기
		// 금액 계산
		// 유 시간 계산
		return new Payment(
				orderId, currency, foreignCurrentAmount, BigDecimal.ZERO, BigDecimal.ZERO, LocalDateTime.now()
		);
	}

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		Payment payment = paymentService.prepare(100L, "USD", new BigDecimal("50.7"));

		System.out.println("payment = " + payment);
	}
}
