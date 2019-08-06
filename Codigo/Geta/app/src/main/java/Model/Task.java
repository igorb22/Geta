package Model;

import java.sql.Time;
import java.util.Date;

public class Task {

    private int idTarefa;
    private String descricao;
    private String dia;
    private String hora;
    private int idUsuario;
    private boolean tarefaPessoal;
    private boolean foiRealizada;
    private int idTarefaPeriodica;
    private String data;


    public Task(){}

    public Task(int idTarefa, String descricao, String dia, String hora, int idUsuario, boolean tarefaPessoal, boolean foiRealizada, int idTarefaPeriodica, String data) {
        this.idTarefa = idTarefa;
        this.descricao = descricao;
        this.dia = dia;
        this.hora = hora;
        this.idUsuario = idUsuario;
        this.tarefaPessoal = tarefaPessoal;
        this.foiRealizada = foiRealizada;
        this.idTarefaPeriodica = idTarefaPeriodica;
        this.data = data;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setTarefaPessoal(boolean tarefaPessoal) {
        this.tarefaPessoal = tarefaPessoal;
    }

    public void setFoiRealizada(boolean foiRealizada) {
        this.foiRealizada = foiRealizada;
    }

    public void setIdTarefaPeriodica(int idTarefaPeriodica) {
        this.idTarefaPeriodica = idTarefaPeriodica;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public boolean getTarefaPessoal() {
        return tarefaPessoal;
    }

    public boolean isFoiRealizada() {
        return foiRealizada;
    }

    public int getIdTarefaPeriodica() {
        return idTarefaPeriodica;
    }

    public String getData() {
        return data;
    }
}
