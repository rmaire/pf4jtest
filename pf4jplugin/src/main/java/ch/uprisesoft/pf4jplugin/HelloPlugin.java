/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.uprisesoft.pf4jplugin;

import ch.uprisesoft.pf4jinterface.Greeting;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

/**
 *
 * @author rmaire
 */
public class HelloPlugin  extends Plugin {
    public HelloPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        System.out.println("HelloPlugin.start()");
    }

    @Override
    public void stop() {
        System.out.println("HelloPlugin.stop()");
    }

    @Extension
    public static class HelloGreeting implements Greeting {

        @Override
        public String getGreeting() {
            return "Yoohoo";
        }

    }
}
