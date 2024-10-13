package support;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.apache.logging.log4j.core.appender.ConsoleAppender;

import java.util.Arrays;

public class DonutMain {
    public static void main(String[] args) {
        //String name = "Ozzy";
        DonutShop dshop1 = new DonutShop("Ozzy's Donut Shop",1400,6000);
//        System.out.println(dshop.name);
//        System.out.println(dshop.area);
//
//        System.out.println(dshop.makeDonut("Strawberry"));

        DonutShop dshop2 = new DonutShop("Rosie's Donut Shop",1000,3000);

       //System.out.println(dshop1.makeDonut("Blueberry")) ;
        System.out.println(dshop1.getRent());
        System.out.println(dshop2.getRent());

        //set rent
        dshop1.setRent(5000);
        dshop2.setRent(2500);
        //print rent after setting to new values
        System.out.println(dshop1.getRent());
        System.out.println(dshop2.getRent());

        System.out.println(Arrays.toString(dshop1.sellDonuts("Chocolate", 4)));


    }
}
