package com.javastudy.Collection.Model;

@FunctionalInterface
public interface Converter <F, T>{
    T convert(F from);
}
