package com.example;

import org.yaml.snakeyaml.Yaml;

public class App {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        String input = "test: value";
        Object output = yaml.load(input);
        System.out.println(output);
    }
}

