package com.javabydeveloper.lombok.settergetter;

public class Payment {
	private Long id;
	private String status = simpleDefaultStatus();
	private final java.util.concurrent.atomic.AtomicReference<Object> surCharge = new java.util.concurrent.atomic.AtomicReference<Object>();

	private double complexSurchargeLogic() {
		Double surcharge = Math.PI;
		System.out.println("Called Lazy getSurcharge method");
		return surcharge;
	}

	private String simpleDefaultStatus() {
		System.out.println("Called EAGER getStatus method");
		return "NOT_INITIALIZED";
	}

	public Long getId() {
		return this.id;
	}

	public String getStatus() {
		return this.status;
	}

	public double getSurCharge() {
		Object value = this.surCharge.get();
		if (value == null) {
			synchronized (this.surCharge) {
				value = this.surCharge.get();
				if (value == null) {
					final double actualValue = complexSurchargeLogic();
					value = actualValue;
					this.surCharge.set(value);
				}
			}
		}
		return (Double) value;
	}
}
