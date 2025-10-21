package com.example.docktxt;

import com.example.doccore.DocumentProcessor;

/**
 * Implementasi DocumentProcessor untuk format plain text.
 */
public class PlainTextProcessor implements DocumentProcessor {

    @Override
    public String process(String content) {
        if (content == null || content.isEmpty()) {
            return "(empty plain-text document)";
        }
        // sederhana: normalize line endings + menambahkan nomor baris
        String[] lines = content.replace("\r\n", "\n").split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            sb.append(String.format("%2d: %s%n", i + 1, lines[i]));
        }
        return sb.toString();
    }

    @Override
    public String getFormatName() {
        return "plain-text";
    }
}
