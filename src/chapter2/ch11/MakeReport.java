package chapter2.ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";

    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-1234-5678 \n");

        buffer.append("Tomas \t");
        buffer.append("NewYork \t");
        buffer.append("010-1111-2222 \t");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();;
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
