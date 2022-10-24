public class Main {

//EJERCICIO TEMA 9: HERENCIA, POLIMORFISMO E INTERFACES.

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.Edad = (24);
        cliente.Nombre = ("Raúl");
        cliente.Telefono = (645234561);
        cliente.Credito = (12500);
        System.out.println("Soy " + cliente.Nombre + ",tengo " + cliente.Edad + " años y mi telefono es "
                + cliente.Telefono + " y mi credito disponible es " + cliente.Credito + "€");

        trabajador.Edad = (44);
        trabajador.Nombre = ("Gonzalo");
        trabajador.Telefono = (667892345);
        trabajador.salario = (950);
        System.out.println("Soy " + trabajador.Nombre + ",tengo " + trabajador.Edad + " años y mi telefono es "
                + cliente.Telefono + " y mi salario es de " + trabajador.salario + "€");
    }
}
class Persona {
    int Edad;
    String Nombre;
    int Telefono;
}

class Cliente extends Persona {
    double Credito;
}

class Trabajador extends Persona {
    double salario;
}