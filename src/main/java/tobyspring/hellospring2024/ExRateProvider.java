package tobyspring.hellospring2024;

import java.io.IOException;
import java.math.BigDecimal;

public interface ExRateProvider {
	BigDecimal getExRate(String currency) throws IOException;
}
