package tenderi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tenderi.domain.Anex;

/**
 * Spring Data SQL repository for the Prvorangirani entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AnexRepository extends JpaRepository<Anex, Long>, JpaSpecificationExecutor<Anex> {
    List<Anex> findBySifra_postupkaAndSifra_ponude(
        @Param("sifra_postupka") Integer sifra_postupka,
        @Param("sifra_ponude") Integer sifra_ponude
    );
}
