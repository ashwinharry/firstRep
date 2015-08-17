/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author askolli
 */
@ApplicationPath("bangalore")
public class MyApplication extends Application{
    public Set<Class<?>> getClasses(){
        Set<Class<?>> set=new HashSet();
        set.add(com.rs.FirstRS.class);
        return set;
        
    
    
    
    }
}
