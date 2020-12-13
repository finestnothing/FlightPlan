package edu.csc131.FlightPlan;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String serverapikey;
    private String webapikey;

    public String getServerapikey() {
        return serverapikey;
    }

    public void setServerapikey(String serverapikey) {
        this.serverapikey = serverapikey;
    }

    public String getWebapikey() {
        return webapikey;
    }

    public void setWebapikey(String webapikey) {
        this.webapikey = webapikey;
    }



}
