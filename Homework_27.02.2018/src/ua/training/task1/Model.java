package ua.training.task1;

/**
 * Created by Alyona Korzhakova on 27.02.2018.
 */

public class Model
{
    private String value0;
    private String value1;

    // The program logic
    public String addTwoWords() {
        return value0 + value1;
    }

    public String getValue0() {
        return value0;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue0(String value0) {
        this.value0 = value0;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
}
