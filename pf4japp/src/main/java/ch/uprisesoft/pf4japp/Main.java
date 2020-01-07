/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.uprisesoft.pf4japp;

import ch.uprisesoft.pf4jinterface.Greeting;
import java.util.List;
import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;

/**
 *
 * @author rmaire
 */
public class Main {

    public static void main(String[] args) {

        PluginManager pluginManager = new DefaultPluginManager();
//        PluginManager pluginManager = new DefaultPluginManager(Paths.get("./bla"));
        
        System.out.println(System.getProperty("pf4j.pluginsDir"));

        pluginManager.loadPlugins();
        pluginManager.startPlugins();

        List<Greeting> greetings = pluginManager.getExtensions(Greeting.class);
        System.out.println(String.format("Found %d extensions for extension point '%s'", greetings.size(), Greeting.class.getName()));
        for (Greeting greeting : greetings) {
            System.out.println(">>> " + greeting.getGreeting());
        }
        
        pluginManager.stopPlugins();
    }
}
