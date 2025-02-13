package co.jp.mamol.Form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable{

    @NotNull //入力チェック
    @Size(min = 1, max = 5) //入力チェック

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}