package exercise;

import exercise.drive.SSDDrive;
import exercise.file.imagefile.GIFImageFile;
import exercise.file.imagefile.JPGImageFile;
import exercise.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {

        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 100, 80);

        MP3MusicFile mp3file = new MP3MusicFile("nazwa1.mp3", 4000, "Mozart", "Rquiem", 100);

        SSDDrive drive = new SSDDrive();
        drive.addFiles(gif1);
        drive.addFiles(jpg1);
        drive.addFiles(mp3file);

        drive.listFiles();



    }
}
