package lemur.lemur;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
public class Lemur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;

    private Boolean movesIt;

    private Double weight;

    private String species;

    public Lemur() {
    }

    public Lemur(Long id, Integer age, Boolean movesIt, Double weight, String species) {
        this.id = id;
        this.age = age;
        this.movesIt = movesIt;
        this.weight = weight;
        this.species = species;
    }

    public Lemur(Integer age, Boolean movesIt, Double weight, String species) {
        this.age = age;
        this.movesIt = movesIt;
        this.weight = weight;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Lemur{" +
                "id=" + id +
                ", age=" + age +
                ", movesIt=" + movesIt +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lemur)) return false;
        Lemur lemur = (Lemur) o;
        return Objects.equals(getId(), lemur.getId()) &&
                Objects.equals(getAge(), lemur.getAge()) &&
                Objects.equals(getMovesIt(), lemur.getMovesIt()) &&
                Objects.equals(getWeight(), lemur.getWeight()) &&
                Objects.equals(getSpecies(), lemur.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAge(), getMovesIt(), getWeight(), getSpecies());
    }
}
