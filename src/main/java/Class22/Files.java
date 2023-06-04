package Class22;

abstract public class Files {
    public String name;
    private int size;

    public Files(String name, int size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();

    public void edit() {
        System.out.println("To the edit file you need to open it first");
    }

    public void close() {
        System.out.println("To close the file you need to click on X icon");
    }
}

class JavaFile extends Files {
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text");
    }
}

class WordFile extends Files {
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft word  to be installed");
    }
}

class PdfFile extends Files {
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .pdf file we need Adobe reader");
    }
}

class FileTester {
    public static void main(String[] args) {
        Files[] files = {new JavaFile("Batch 16", 243), new WordFile("Text", 25), new PdfFile("Java Book", 4256)};
        for (Files file : files) {
            file.open();
            file.edit();
            file.close();
        }
    }
}