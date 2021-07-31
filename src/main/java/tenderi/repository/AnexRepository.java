package tenderi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tenderi.domain.Anex;
import tenderi.domain.UgovorPdf;

/**
 * Spring Data SQL repository for the Prvorangirani entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AnexRepository extends JpaRepository<Anex, Long>, JpaSpecificationExecutor<Anex> {
    @Query("select p from Anex p where p.sifra_postupka=:sifra_postupka and p.sifra_ponude=:sifra_ponude")
    List<Anex> findSifreAnex(@Param("sifra_postupka") Integer sifra_postupka, @Param("sifra_ponude") Integer sifra_ponude);
}
