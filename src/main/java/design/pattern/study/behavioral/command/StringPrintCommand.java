package design.pattern.study.behavioral.command;

public class StringPrintCommand implements Command {

    private String str;

    public StringPrintCommand(String string) {
        this.str = string;
    }

    @Override
    public int compareTo(Command o) { // compareTo의 o 는 other 를 뜻함!!
        StringPrintCommand other = (StringPrintCommand) o;
        return this.str.length() - other.str.length();
    }

    @Override
    public void execute() {
        System.out.println(this.str);
    }

}/////
