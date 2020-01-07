/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.uprisesoft.pf4jinterface;

import org.pf4j.ExtensionPoint;

/**
 *
 * @author rmaire
 */
public interface Greeting extends ExtensionPoint {
    
    public String getGreeting();
    
}
