package com.armatech.jdbcTemplateTrain.mappers;

public interface Mapper<A,B> { //converting between two object types

    B mapTo(A a); //return type B and take type A

    A mapFrom(B b); //return type A and take type B
}