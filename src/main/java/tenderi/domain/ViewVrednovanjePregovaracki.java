package tenderi.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A ViewVrednovanje.
 */
@Entity
@Table(name = "viewvrednovanjepregovaracki")
public class ViewVrednovanjePregovaracki implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "sifra_postupka")
    private Integer sifraPostupka;

    @Column(name = "sifra_ponude")
    private Integer sifraPonude;

    @Column(name = "broj_partije")
    private Integer brojPartije;

    @Column(name = "atc")
    private String atc;

    @Column(name = "inn")
    private String inn;

    @Column(name = "zasticeni_naziv")
    private String zasticeniNaziv;

    @Column(name = "farmaceutski_oblik_lijeka")
    private String farmaceutskiOblikLijeka;

    @Column(name = "jacina_lijeka")
    private String jacinaLijeka;

    @Column(name = "pakovanje")
    private String pakovanje;

    @Column(name = "trazena_kolicina")
    private Integer trazenaKolicina;

    @Column(name = "procijenjena_vrijednost")
    private Double procijenjenaVrijednost;

    @Column(name = "ponudjena_vrijednost")
    private Double ponudjenaVrijednost;

    @Column(name = "rok_isporuke")
    private Integer rokIsporuke;

    @Column(name = "naziv_proizvodjaca")
    private String nazivProizvodjaca;

    public String getNazivPonudjaca() {
        return nazivPonudjaca;
    }

    @Column(name = "naziv_ponudjaca")
    private String nazivPonudjaca;

    @Column(name = "bod_cijena")
    private Double bodCijena;

    //    @Column(name = "bod_rok")
    //    private Double bodRok;
    //
    //    @Column(name = "bod_ukupno")
    //    private Double bodUkupno;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ViewVrednovanjePregovaracki id(Long id) {
        this.id = id;
        return this;
    }

    public Integer getSifraPostupka() {
        return this.sifraPostupka;
    }

    public ViewVrednovanjePregovaracki sifraPostupka(Integer sifraPostupka) {
        this.sifraPostupka = sifraPostupka;
        return this;
    }

    public void setSifraPostupka(Integer sifraPostupka) {
        this.sifraPostupka = sifraPostupka;
    }

    public Integer getSifraPonude() {
        return this.sifraPonude;
    }

    public ViewVrednovanjePregovaracki sifraPonude(Integer sifraPonude) {
        this.sifraPonude = sifraPonude;
        return this;
    }

    public void setSifraPonude(Integer sifraPonude) {
        this.sifraPonude = sifraPonude;
    }

    public Integer getBrojPartije() {
        return this.brojPartije;
    }

    public ViewVrednovanjePregovaracki brojPartije(Integer brojPartije) {
        this.brojPartije = brojPartije;
        return this;
    }

    public void setBrojPartije(Integer brojPartije) {
        this.brojPartije = brojPartije;
    }

    public String getAtc() {
        return this.atc;
    }

    public ViewVrednovanjePregovaracki atc(String atc) {
        this.atc = atc;
        return this;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public String getInn() {
        return this.inn;
    }

    public ViewVrednovanjePregovaracki inn(String inn) {
        this.inn = inn;
        return this;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getZastceniNaziv() {
        return this.zasticeniNaziv;
    }

    public ViewVrednovanjePregovaracki zastceniNaziv(String zastceniNaziv) {
        this.zasticeniNaziv = zastceniNaziv;
        return this;
    }

    public void setZastceniNaziv(String zastceniNaziv) {
        this.zasticeniNaziv = zastceniNaziv;
    }

    public String getFarmaceutskiOblikLijeka() {
        return this.farmaceutskiOblikLijeka;
    }

    public ViewVrednovanjePregovaracki farmaceutskiOblikLijeka(String farmaceutskiOblikLijeka) {
        this.farmaceutskiOblikLijeka = farmaceutskiOblikLijeka;
        return this;
    }

    public void setFarmaceutskiOblikLijeka(String farmaceutskiOblikLijeka) {
        this.farmaceutskiOblikLijeka = farmaceutskiOblikLijeka;
    }

    public String getJacinaLijeka() {
        return this.jacinaLijeka;
    }

    public ViewVrednovanjePregovaracki jacinaLijeka(String jacinaLijeka) {
        this.jacinaLijeka = jacinaLijeka;
        return this;
    }

    public void setJacinaLijeka(String jacinaLijeka) {
        this.jacinaLijeka = jacinaLijeka;
    }

    public String getPakovanje() {
        return this.pakovanje;
    }

    public ViewVrednovanjePregovaracki pakovanje(String pakovanje) {
        this.pakovanje = pakovanje;
        return this;
    }

    public void setPakovanje(String pakovanje) {
        this.pakovanje = pakovanje;
    }

    public Integer getTrazenaKolicina() {
        return this.trazenaKolicina;
    }

    public ViewVrednovanjePregovaracki trazenaKolicina(Integer trazenaKolicina) {
        this.trazenaKolicina = trazenaKolicina;
        return this;
    }

    public void setTrazenaKolicina(Integer trazenaKolicina) {
        this.trazenaKolicina = trazenaKolicina;
    }

    public Double getProcijenjenaVrijednost() {
        return this.procijenjenaVrijednost;
    }

    public ViewVrednovanjePregovaracki procijenjenaVrijednost(Double procijenjenaVrijednost) {
        this.procijenjenaVrijednost = procijenjenaVrijednost;
        return this;
    }

    public void setProcijenjenaVrijednost(Double procijenjenaVrijednost) {
        this.procijenjenaVrijednost = procijenjenaVrijednost;
    }

    public Double getPonudjenaVrijednost() {
        return this.ponudjenaVrijednost;
    }

    public ViewVrednovanjePregovaracki ponudjenaVrijednost(Double ponudjenaVrijednost) {
        this.ponudjenaVrijednost = ponudjenaVrijednost;
        return this;
    }

    public void setPonudjenaVrijednost(Double ponudjenaVrijednost) {
        this.ponudjenaVrijednost = ponudjenaVrijednost;
    }

    public Integer getRokIsporuke() {
        return this.rokIsporuke;
    }

    public ViewVrednovanjePregovaracki rokIsporuke(Integer rokIsporuke) {
        this.rokIsporuke = rokIsporuke;
        return this;
    }

    public void setRokIsporuke(Integer rokIsporuke) {
        this.rokIsporuke = rokIsporuke;
    }

    public String getNazivProizvodjaca() {
        return this.nazivProizvodjaca;
    }

    public ViewVrednovanjePregovaracki nazivProizvodjaca(String nazivProizvodjaca) {
        this.nazivProizvodjaca = nazivProizvodjaca;
        return this;
    }

    public void setNazivProizvodjaca(String nazivProizvodjaca) {
        this.nazivProizvodjaca = nazivProizvodjaca;
    }

    public Double getBodCijena() {
        return this.bodCijena;
    }

    public ViewVrednovanjePregovaracki bodCijena(Double bodCijena) {
        this.bodCijena = bodCijena;
        return this;
    }

    public void setBodCijena(Double bodCijena) {
        this.bodCijena = bodCijena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewVrednovanjePregovaracki)) {
            return false;
        }
        return id != null && id.equals(((ViewVrednovanjePregovaracki) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ViewVrednovanje{" +
            "id=" + getId() +
            ", sifraPostupka=" + getSifraPostupka() +
            ", sifraPonude=" + getSifraPonude() +
            ", brojPartije=" + getBrojPartije() +
            ", atc='" + getAtc() + "'" +
            ", inn='" + getInn() + "'" +
            ", zastceniNaziv='" + getZastceniNaziv() + "'" +
            ", farmaceutskiOblikLijeka='" + getFarmaceutskiOblikLijeka() + "'" +
            ", jacinaLijeka='" + getJacinaLijeka() + "'" +
            ", pakovanje='" + getPakovanje() + "'" +
            ", trazenaKolicina=" + getTrazenaKolicina() +
            ", procijenjenaVrijednost=" + getProcijenjenaVrijednost() +
            ", ponudjenaVrijednost=" + getPonudjenaVrijednost() +
            ", rokIsporuke=" + getRokIsporuke() +
            ", nazivProizvodjaca='" + getNazivProizvodjaca() + "'" +
            ", bodCijena=" + getBodCijena() +

            "}";
    }
}
