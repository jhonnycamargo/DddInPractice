package com.example.ddd.in.practice.logic;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

@ToString
@EqualsAndHashCode
public abstract class ValueObject<T> {
    private Class<T> type;

    public ValueObject(Class<T> type) {
        this.type = type;
    }

    public abstract boolean notEquals(T value1, T value2);

    public static <T> boolean valueObjectEquals(ValueObject<T> vo1, ValueObject<T> vo2) {
        if (Objects.isNull(vo1) && Objects.isNull(vo2)) {
            return true;
        }
        if (Objects.isNull(vo1) || Objects.isNull(vo2)) {
            return false;
        }
        return vo1.equals(vo2);
    }

    public static <T> boolean valueObjectNotEquals(ValueObject<T> vo1, ValueObject<T> vo2) {
        return !valueObjectEquals(vo1, vo2);
    }

}
