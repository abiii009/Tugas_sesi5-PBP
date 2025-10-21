package com.example.doccore;

/**
 * Kontrak service untuk memproses konten dokumen.
 */
public interface DocumentProcessor {
    /**
     * Proses konten dokumen dan kembalikan hasil pemrosesan (mis. render atau transform).
     * @param content isi dokumen (raw)
     * @return hasil pemrosesan
     */
    String process(String content);

    /**
     * Nama format yang didukung, mis: "plain-text", "html", dll.
     * @return nama format
     */
    String getFormatName();
}
