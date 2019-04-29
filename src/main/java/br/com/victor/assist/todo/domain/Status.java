package br.com.victor.assist.todo.domain;

public enum Status {
    TODO("TODO"),DOING("DOING"),DONE("DONE");

    String key;

    Status(String key){this.key = key; }

    Status(){ }

    Status getValue(String x) {
        if ("TODO".equals(x)) { return TODO; }
        else if ("DOING".equals(x)) { return DOING; }
        else if ("DONE".equals(x)) { return DONE; }
        else throw new IllegalArgumentException();
    }

}
