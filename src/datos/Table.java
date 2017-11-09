package datos;

import java.util.ArrayList;

public class Table {
    
    private String name;
    private ArrayList< Key > keys;
    private ArrayList< ForeingKey > foreingKeys;
    private ArrayList< Column > columns;

    public Table(String name) {
        this.name = name;
        this.keys = new ArrayList();
        this.foreingKeys = new ArrayList();
        this.columns = new ArrayList();
    }
    
    public void addColumn(String name, String dataType){
        Column c = new Column(name, dataType);
        this.columns.add(c);
    }
    
    public void addKey(String name, String dataType){
        Key k = new Key (name, dataType);
        this.keys.add(k);
    }
    
    public void addForeingKey(String name, String dataType, Table table){
        ForeingKey f = new ForeingKey(name, dataType);
        f.setTable(table);
        this.foreingKeys.add(f);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Key> getKeys() {
        return keys;
    }

    public ArrayList<ForeingKey> getForeingKeys() {
        return foreingKeys;
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setName(String name) {
        this.name = name;
    }
}
