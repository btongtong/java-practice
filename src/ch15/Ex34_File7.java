package ch15;

import java.io.File;
import java.io.FilenameFilter;

public class Ex34_File7 {
    public static void main(String[] args) throws Exception {
        if(args.length != 1) {
            System.out.println("USAGE: java Ex34_File7 pattern");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        final String pattern = args[0];

        String[] files = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.indexOf(pattern) != -1;
            }
        });

        for(int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
