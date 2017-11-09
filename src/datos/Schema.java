package datos;

import java.util.ArrayList;
import java.util.HashMap;

public class Schema {
    private String name;
    private ArrayList<Table> tables;
    
    public Schema(String name) {
        this.name = name;
        this.tables = new ArrayList();
    }
    
    public void addTable(String name){
        Table t = new Table (name);
        this.tables.add(t);
    }
    
    public ArrayList<Column> listarColumnas (){
        ArrayList<Column> columnas = new ArrayList();
        for (Table tablas : tables){
            columnas.addAll(tablas.getColumns());
        }
        return columnas;
    }
    
    public HashMap <String, String> listarTablas() {
        HashMap <String, String> tablasCondicion = new HashMap();
        
        for( Table tabla : tables){
            for( ForeingKey externa : tabla.getForeingKeys()){
                tablasCondicion.put(tabla.getName(), externa.getTable().getName());
            }
        } return tablasCondicion;
    }
    
    public Table getTable(String name){
        for (Table table : tables) {
            if(table.getName().equals(name))
                return table;
        }
        return null;
    }
}
