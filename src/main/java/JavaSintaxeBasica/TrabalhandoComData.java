package JavaSintaxeBasica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhandoComData {
    public static void main(String[] args) throws ParseException {
        String data = "29/02/1992";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
        Date date = formato.parse(data);
        System.out.println(date);
}
}
