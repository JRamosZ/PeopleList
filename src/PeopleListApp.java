package ListPeopleApp.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleListApp {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        List <Person> people = new ArrayList<>(); 
        //Declarar menu
        var exit = false;
        while (!exit) {
            showMenu();
            try {
                exit = executeOperation(console, people);
            } catch (Exception e) {
                System.out.println("Ocurrió un problema: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void showMenu() {
        System.out.println("""
                **** Listado de Personas APP ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opción deseada: ");
    }

    private static boolean executeOperation(Scanner console, List <Person> peopleList) {
        var option = Integer.parseInt(console.nextLine());
        var exit = false;
        //Revisamos la opción seleccionada
        switch (option) {
            case 1 -> {
                System.out.print("Proporciona el nombre: ");
                var name = console.nextLine();
                System.out.print("Proporciona el teléfono: ");
                var phone = console.nextLine();
                System.out.print("Proporciona el email: ");
                var email = console.nextLine();

                var person = new Person(name, phone, email);
                peopleList.add(person);
                System.out.println("La lista tiene: " + peopleList.size() + " elementos");
            }

            case 2 -> {
                System.out.println("Listado de personas: ");
                //Mejora usando lamda y método de referencia
                peopleList.forEach((person) -> System.out.println(person));
                peopleList.forEach(System.out::println);
            }

            case 3 -> {
                System.out.println("Gracias vuelva pronto...");
                exit = true;
            }
        
            default -> {
                System.out.println("Opción errónea: " + option);
            }
        }
        return exit;
    }

}
