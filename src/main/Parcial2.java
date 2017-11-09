package main;

import datos.Schema;
//import datos.Column;
//import datos.ForeingKey;
//import datos.Key;
//import datos.Table;

public class Parcial2 {

    public static void main(String[] args) {
        System.out.println("asdasdasdasdasdasdasd");
        Schema a = new Schema("a");
        a.addTable("b");
        a.addTable("c");
        a.getTable("b").addColumn("lol", "esta");
        
        for(int i = 0; i < a.listarColumnas().size(); i++){
            System.out.println(a.listarColumnas());
        }
        //System.out.println(a.forEach(listarColumnas()));
        a.getTable("b").addForeingKey("asdasd", "asdasdasd", a.getTable("c"));
        System.out.println(a.listarTablas());
    }
    
}
