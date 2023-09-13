import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do paciente: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("Informe o ID do exame: ");
        int idExame = scanner.nextInt();
        System.out.print("Informe o nível de glicose: ");
        int nivelGlicose = scanner.nextInt();

        exameGlicemia exame = new exameGlicemia();

        exame.setNomePaciente(nomePaciente);
        exame.setIdExame(idExame);
        exame.setNivelGlicose(nivelGlicose);

        System.out.println("*******************");
        System.out.println("Paciente: " + exame.getNomePaciente());
        System.out.println("ID Exame: " + exame.getIdExame());
        System.out.println("Nível de glicose " + exame.getNivelGlicose());
        System.out.println("Diagnóstico " + exame.obterDiagnostico());
        System.out.println("*******************");
    }
}