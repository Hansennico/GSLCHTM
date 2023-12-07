import java.util.List;
import java.util.Map;
package Models;

public class Model {


public class CSVQueryFacade {
    private CSVReader reader;
    private CSVWriter writer;

    public CSVQueryFacade(String filePath) {
        this.reader = new CSVReader(filePath);
        this.writer = new CSVWriter(filePath);
    }

    public List<Map<String, String>> query(String column, String value) {
        return reader.readRecords(column, value);
    }

    public void insert(Map<String, String> record) {
        writer.writeRecord(record);
    }
}

}
