package gq.noxiuam.mongofucker;

import gq.noxiuam.mongofucker.impl.MongoFucker;
import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

    public static void main(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("url").withRequiredArg().required().ofType(String.class);

        OptionSet options;

        try {
            options = parser.parse(args);
        } catch (OptionException ex) {
            System.out.println("Usage: java -jar MongoFucker.jar --url <mongo uri>");
            System.out.println(ex.getMessage());
            return;
        }

        String inputUrl = (String) options.valueOf("url");

        new MongoFucker(inputUrl);
    }

}
