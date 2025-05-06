package com.example.calculadora2;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
        private static final String TAG = "MainActivity";
        private Calculadora calculadora;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            calculadora = new CalculadoraBasica();

            // Ejemplos de operaciones
            try {
                double x = calculadora.sumar(5, 3);
                System.out.println("El resultado de esta suma es: " + x);
                //Log.d(TAG, "Resultado de sumar 5 y 3: " + x);
                double y = calculadora.restar(10, 4);
                System.out.println("El resultado de restar 10 y 4 es: " + y);
                double z = calculadora.multiplicar(7, 8);
                System.out.println("El resultado de multiplicar 7 y 8 es: " + z);
                double w = calculadora.dividir(20, 5);
                System.out.println("El resultado de esta división es: " + w);


                // Prueba de división por cero
            } catch (ArithmeticException e) {
                Log.e(TAG, "Excepción aritmética: " + e.getMessage());
            } catch (Exception e) {
                Log.e(TAG, "Error inesperado: " + e.getMessage());
            }
        }
    }
