package com.spring.autowiring;
public class Engine {
    private String type;
    
    public Engine() {
		
	}

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}