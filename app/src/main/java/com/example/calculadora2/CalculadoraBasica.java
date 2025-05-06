package com.example.calculadora2;
import android.util.Log;
//Por alguna razón me marca error con los tags de log.
public class CalculadoraBasica implements Calculadora {
    private static final String TAG = "CalculadoraBasica";

    @Override
    public double sumar(double a, double b) {
        double resultado = a + b;
        Log.d(TAG, "Suma: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    @Override
    public double restar(double a, double b) {
        double resultado = a - b;
        Log.d(TAG, "Resta: " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    @Override
    public double multiplicar(double a, double b) {
        double resultado = a * b;
        Log.d(TAG, "Multiplicación: " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    @Override
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            Log.e(TAG, "Error: División entre cero");
            throw new ArithmeticException("División entre cero");
        }

        double resultado = a / b;

        if (Double.isNaN(resultado)) {
            Log.e(TAG, "Error: Resultado no es un número (NaN)");
            throw new ArithmeticException("Resultado NaN");
        }

        Log.d(TAG, "División: " + a + " / " + b + " = " + resultado);
        return resultado;
    }
}