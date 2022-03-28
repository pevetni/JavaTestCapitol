package com.capitol.springboot.app.prices.models.entity;

import java.util.HashMap;
import java.util.Map;

public enum Brand {
	OTHER(0),
	ZARA(1);
	
	private long value;
    private static Map map = new HashMap<>();

    private Brand(long value) {
        this.value = value;
    }

    static {
        for (Brand brand : Brand.values()) {
            map.put(brand.value, brand);
        }
    }

    public static Brand valueOf(long brand) {
        return (Brand) map.get(brand);
    }

    public long getValue() {
        return value;
    }
}
