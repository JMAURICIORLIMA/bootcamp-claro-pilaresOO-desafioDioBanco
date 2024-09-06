import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Cliente {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Cliente(String nome, String sobrenome, String dataNascimento) throws DateTimeParseException {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.parse(dataNascimento, FORMATO_DATA) ;
    }

    public boolean isMaiorDeIdade() {
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(LocalDate.from(dataNascimento), hoje);
        return idade.getYears() >=18;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataNascimentoFormatada() {
        return dataNascimento.format(FORMATO_DATA);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
