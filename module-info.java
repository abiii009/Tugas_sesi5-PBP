module doc.txt {
    requires doc.core;
    provides com.example.doccore.DocumentProcessor
        with com.example.docktxt.PlainTextProcessor;
}
