package dip1;

import dip1.model.*;
import dip1.model.util.*;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager rm = new ReportManager(new PrinterReporter());
        rm.output(report.getItems());
        ReportManager rm1 = new ReportManager(new ConsoleReporter());
        rm1.output(report.getItems());
    }
}
