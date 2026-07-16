package ex03;

public class Student {

    public String name;

    public double nota1, nota2, nota3;

    public  double notaFinal(){
        return nota1 + nota2 + nota3;
    }
    public double pontosfaltantes(){
        if (notaFinal() < 60){
            return 60 - notaFinal();
        }

        else{
            return 0.0;
        }

    }

}
