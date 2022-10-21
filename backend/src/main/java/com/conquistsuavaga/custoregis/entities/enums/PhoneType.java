package com.conquistsuavaga.custoregis.entities.enums;

public enum PhoneType {

	HOME(1),
	WORK(2), 
	CELLPHONE(3);

	private int code;

	private PhoneType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static PhoneType valueOf(int code) {
		for(PhoneType value : PhoneType.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid type");
	}
}
