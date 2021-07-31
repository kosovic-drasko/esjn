package tenderi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tenderi.domain.UgovorPdf;

/**
 * Spring Data SQL repository for the Ugovor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UgovorPdfRepository extends JpaRepository<UgovorPdf, Long> {
    @Query("select p from UgovorPdf p where p.broj_ugovora=:broj_ugovora")
    List<UgovorPdf> findBrojUgovora(@Param("broj_ugovora") String broj_ugovora);
}
