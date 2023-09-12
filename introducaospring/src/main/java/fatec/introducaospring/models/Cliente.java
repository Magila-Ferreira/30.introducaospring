package fatec.introducaospring.models;

// Mecanismo de identificador (id) automático
import java.rmi.server.UID;
import java.time.LocalDateTime;

// Mecanismo de automatizacão dos getters e setters 
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
public class Cliente {
    private UID id;
    private String nome;
    private LocalDateTime nascimento;
}
