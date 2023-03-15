package com.kafkaProducer.kafkaProducer.model;

import lombok.Data;

@Data
public class User {

    private int id;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;
}
