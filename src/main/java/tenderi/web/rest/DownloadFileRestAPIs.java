package tenderi.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tenderi.service.ExcelFileServicesPonude;

@RestController
public class DownloadFileRestAPIs {

    @Autowired
    ExcelFileServicesPonude fileServices;

    /*
     * Download Files
     */
    @GetMapping("/api/file")
    public ResponseEntity<InputStreamResource> downloadFile() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=ponude.xlsx");

        return ResponseEntity
            .ok()
            .headers(headers)
            .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
            .body(new InputStreamResource(fileServices.loadFile()));
    }
}
