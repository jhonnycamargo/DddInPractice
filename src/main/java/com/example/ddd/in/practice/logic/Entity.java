package com.example.ddd.in.practice.logic;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Objects;

@Getter
@EqualsAndHashCode
public abstract class Entity {
    private long id;

    public static boolean entityEquals(Entity entity1, Entity entity2) {
        if (Objects.isNull(entity1) && Objects.isNull(entity2)) {
            return true;
        }
        if (Objects.isNull(entity1) || Objects.isNull(entity2)) {
            return false;
        }
        return entity1.equals(entity2);
    }

    public static boolean entityNotEquals(Entity entity1, Entity entity2) {
        return !entityEquals(entity1, entity2);
    }

}
