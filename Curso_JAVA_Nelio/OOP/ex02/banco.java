package ex02;

import java.util.concurrent.RecursiveTask;

public class banco {

    public String name;
    public double salario;
    public double tax;
    public double imposto;

    public double NetSalary()
    {
        return salario - tax;
    }

    public double IncreaseSalary(){
        return ((salario * imposto) / 100) + NetSalary();
    }



}
