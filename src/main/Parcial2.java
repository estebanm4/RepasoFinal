package main;

import datos.Schema;
//import datos.Column;
//import datos.ForeingKey;
//import datos.Key;
//import datos.Table;

public class Parcial2 {

    public static void main(String[] args) {
        System.out.println("asdasdasdasdasdasdasd");
        Schema a = new Schema( "a");
        a.addTable("b");
        a.getTable("b").addColumn("lol", "esta");
        System.out.println(a.listarColumnas().toString());
        a.getTable("b").addForeingKey("asdasd", "asdasdasd", a.getTable("b"));
        System.out.println(a.listarTablas().toString());
        
    }
    
}
