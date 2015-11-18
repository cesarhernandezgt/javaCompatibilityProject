package com.blogspot.cesarhernandezgt.javaCompatibilityProject;




import java.time.LocalDateTime;



public class App 
{
    public static void main( String[] args )
    {
    	// Solo funciona con jdk >=  8.x
    	System.out.println("Resultado: " + Integer.toUnsignedString( 42 ) );

    	
    	
    	//LocalDateTime timePoint = LocalDateTime.now(); 
    	//System.out.println("Mes actual: "+timePoint.getMonth());
    }
}
