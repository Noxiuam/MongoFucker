package gq.noxiuam.mongofucker.data;

import java.util.Random;

public class StringUtil {

    public String[] runes = new String[]{"ᚫ","ᛂ","ᛟ","ᛋ","ᚱ","ᛗ","ᚣ","ᛚ","ᚩ","ᚻ","ᚳ","ᚦ","ᚷ","ᚹ","ᛉ","p","ᚪ","ᛁ","ᛈ","ᛞ","ᚢ","ᚾ","ᚠ","ᛡ","ᛏ","ᛇ"};

    public String getRandomizedString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 23; i++) {
            Random tick = new Random();
            int pos = tick.nextInt(runes.length);
            stringBuilder.append(runes[pos]);
        }

        String fileName = stringBuilder.toString();
        StringBuilder buffer = new StringBuilder();

        for (Character s : fileName.toCharArray()) {
            buffer.append(s);
        }

        return buffer.toString();
    }

}
