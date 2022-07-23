package exercise.drive;

import exercise.file.File;

public interface Drive {
    void addFiles(File file);
    void listFiles();
    File findFile(String name);



}
