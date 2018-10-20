package com.DevAkademi.MemoryComputing;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;

public class IgniteFactory {
    private IgniteFactory() {}

   
    public static Ignite createIgniteNodeWithSpecificConfiguration(String nodeType, String configFilePath){
        if (nodeType.equalsIgnoreCase("c"))
            Ignition.setClientMode(true);
        try{
            System.out.println("Ignite node have created successfully");
            return Ignition.start(configFilePath);

        }
        catch (IgniteException e){
            System.out.println("Can not create Ignite node");
            e.printStackTrace();
        }

        return null;
    }

 
}