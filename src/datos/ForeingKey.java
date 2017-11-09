package datos;

public class ForeingKey extends Column{
    
    private Table table;

    public ForeingKey(String name, String dataType) {
        super(name, dataType);
    }

    public ForeingKey(Table table, String name, String dataType) {
        super(name, dataType);
        this.table = table;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
