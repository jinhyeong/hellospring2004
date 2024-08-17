package tobyspring.hellospring2024;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
	private Long orderId;
	private String currency;
	private BigDecimal foreignCurrencyAmount;
	private BigDecimal exRate;
	private BigDecimal convertedAmount;
	private LocalDateTime validUntil;

	public Payment(Long orderId, String currency, BigDecimal foreignCurrencyAmount, BigDecimal exRate, BigDecimal convertedAmount, LocalDateTime validUntil) {
		this.orderId = orderId;
		this.currency = currency;
		this.foreignCurrencyAmount = foreignCurrencyAmount;
		this.exRate = exRate;
		this.convertedAmount = convertedAmount;
		this.validUntil = validUntil;
	}

	public String getCurrency() {
		return currency;
	}

	public Long getOrderId() {
		return orderId;
	}

	public BigDecimal getForeignCurrencyAmount() {
		return foreignCurrencyAmount;
	}

	public BigDecimal getExRate() {
		return exRate;
	}

	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}

	public LocalDateTime getValidUntil() {
		return validUntil;
	}

	@Override
	public String toString() {
		return "Payment{" +
				"orderId=" + orderId +
				", currency='" + currency + '\'' +
				", foreignCurrencyAmount=" + foreignCurrencyAmount +
				", exRate=" + exRate +
				", convertedAmount=" + convertedAmount +
				", validUntil=" + validUntil +
				'}';
	}
}
