package com.example.calculadora2;

public interface Calculadora {
    double sumar(double a, double b);
    double restar(double a, double b);
    double multiplicar(double a, double b);
    double dividir(double a, double b) throws ArithmeticException;
}
