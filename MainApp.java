package com.example.docapp;

import com.example.doccore.Document;
import com.example.doccore.DocumentProcessor;

import java.util.ServiceLoader;

/**
 * Aplikasi utama: menemukan semua DocumentProcessor via ServiceLoader dan menggunakan mereka.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== doc.app starting ===");

        // Contoh dokumen untuk diuji
        Document doc = new Document("Contoh Dokumen",
                "Halo generasi muda!\nIni adalah baris kedua.\nTerima kasih.");

        ServiceLoader<DocumentProcessor> loader = ServiceLoader.load(DocumentProcessor.class);

        boolean found = false;
        for (DocumentProcessor proc : loader) {
            found = true;
            System.out.println();
            System.out.println("Found processor for format: " + proc.getFormatName());
            System.out.println("Processed output:");
            System.out.println("-----------------");
            String out = proc.process(doc.getContent());
            System.out.println(out);
            System.out.println("-----------------");
        }

        if (!found) {
            System.out.println("No DocumentProcessor implementations found via ServiceLoader.");
            System.out.println("Make sure provider modules declare 'provides ... with ...' and are on module path.");
        }

        System.out.println("=== doc.app finished ===");
    }
}
