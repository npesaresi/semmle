package com.mercadolibre;

import com.mercadolibre.router.Router;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import spark.Spark;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        String prop = System.getProperty("spark.port");
        int port = StringUtils.isNotBlank(prop) ? Integer.parseInt(prop) : 8080;

        Spark.port(port);
        new Router().init();

        log.info("Listening on http://localhost:8080/");
        log.info("afh95z3m92fh956nz9v62zv52fh9azmna9h2tz2");
    }

}