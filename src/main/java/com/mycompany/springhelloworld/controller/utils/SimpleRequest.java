package com.mycompany.springhelloworld.controller.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author redlongcity
 */

public class SimpleRequest implements SimpleRequestConstants {
    
    
    
    public SimpleRequest() throws MalformedURLException{
    }
    
    public String getRequest(String url){
        String content = null;
        try {
             content = HttpUtils.getRequest(url).
                    asString(StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(SimpleRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return content;
    }
    
    public String getAnotherGet(String url) throws IOException{
        String content = null;
        content = HttpUtils.anotherGet(url);
        return content;
    }
    
}
