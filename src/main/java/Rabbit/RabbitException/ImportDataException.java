package Rabbit.RabbitException;

public class ImportDataException extends RabbitException {
    @Override
    public String toString() {
        return "Fail to import one or more lines from data.txt due to format error.";
    }
}