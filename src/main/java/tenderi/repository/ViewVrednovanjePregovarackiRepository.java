package tenderi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tenderi.domain.ViewVrednovanje;
import tenderi.domain.ViewVrednovanjePregovaracki;

/**
 * Spring Data SQL repository for the ViewVrednovanje entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ViewVrednovanjePregovarackiRepository extends JpaRepository<ViewVrednovanjePregovaracki, Long> {
    @Query("select v from ViewVrednovanje v where v.sifraPostupka=:sifraPostupka ")
    List<ViewVrednovanje> findBySifraPotupka(@Param("sifraPostupka") Integer sifraPostupka);

    List<ViewVrednovanje> findBySifraPonude(@Param("sifraPonude") Integer sifraPonude);
}
