package tenderi.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Prvorangirani.
 */
@Entity
@Table(name = "view_anex")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Anex implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "sifra_postupka")
    private Integer sifra_postupka;

    @Column(name = "sifra_ponude")
    private Integer sifra_ponude;

    @Column(name = "broj_partije")
    private Integer broj_partije;

    @Column(name = "atc")
    private String atc;

    @Column(name = "inn")
    private String inn;

    @Column(name = "zasticeni_naziv")
    private String zasticeni_naziv;

    @Column(name = "farmaceutski_oblik_lijeka")
    private String farmaceutski_oblik_lijeka;

    @Column(name = "jacina_lijeka")
    private String jacina_lijeka;

    @Column(name = "pakovanje")
    private String pakovanje;

    @Column(name = "trazena_kolicina")
    private Integer trazena_kolicina;

    @Column(name = "procijenjena_vrijednost")
    private Double procijenjena_vrijednost;

    @Column(name = "ponudjena_vrijednost")
    private Double ponudjena_vrijednost;

    @Column(name = "rok_isporuke")
    private Integer rok_isporuke;

    @Column(name = "naziv_ponudjaca")
    private String naziv_ponudjaca;

    @Column(name = "naziv_proizvodjaca")
    private String naziv_proizvodjaca;

    @Column(name = "broj_ugovora")
    private String broj_ugovora;

    @Column(name = "datum_ugovora")
    private LocalDate datum_ugovora;

    public Long getId() {
        return id;
    }

    public Integer getSifra_postupka() {
        return sifra_postupka;
    }

    public Integer getSifra_ponude() {
        return sifra_ponude;
    }

    public Integer getBroj_partije() {
        return broj_partije;
    }

    public String getAtc() {
        return atc;
    }

    public String getInn() {
        return inn;
    }

    public String getZasticeni_naziv() {
        return zasticeni_naziv;
    }

    public String getFarmaceutski_oblik_lijeka() {
        return farmaceutski_oblik_lijeka;
    }

    public String getJacina_lijeka() {
        return jacina_lijeka;
    }

    public String getPakovanje() {
        return pakovanje;
    }

    public Integer getTrazena_kolicina() {
        return trazena_kolicina;
    }

    public Double getProcijenjena_vrijednost() {
        return procijenjena_vrijednost;
    }

    public Double getPonudjena_vrijednost() {
        return ponudjena_vrijednost;
    }

    public Integer getRok_isporuke() {
        return rok_isporuke;
    }

    public String getNaziv_ponudjaca() {
        return naziv_ponudjaca;
    }

    public String getNaziv_proizvodjaca() {
        return naziv_proizvodjaca;
    }

    public String getBroj_ugovora() {
        return broj_ugovora;
    }

    public LocalDate getDatum_ugovora() {
        return datum_ugovora;
    }
}
