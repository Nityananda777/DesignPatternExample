package com.design.solid.openclose;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal price);
}
