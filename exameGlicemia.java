public class exameGlicemia {

    private int idExame;
    private int nivelGlicose;
    private String nomePaciente;

    public String obterDiagnostico() {
        String diagnosticoPaciente;
        if (nivelGlicose <= 99) {
            diagnosticoPaciente = "Normal";
        } else if (nivelGlicose <= 125) {
            diagnosticoPaciente = "Pré-Diabetes";
        } else {
            diagnosticoPaciente = "Diabetes";
        }
        return diagnosticoPaciente;
    }
    public int getNivelGlicose() {
        return nivelGlicose;
    }
    public String getNomePaciente() {
        return nomePaciente;
    }
    public int getIdExame() {
        return idExame;
    }

    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }
    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }
    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }
}
