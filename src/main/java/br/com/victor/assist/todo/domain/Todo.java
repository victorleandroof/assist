package br.com.victor.assist.todo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document("todo")
@ToString
public class Todo implements Serializable {

    @Id
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "title")
    @Field(value = "title")
    private String title;
    @JsonProperty(value = "description")
    @Field(value = "description")
    private String description;
    @JsonProperty(value = "status")
    @Field(value = "status")
    private Status status;
    @JsonProperty(value = "hora_data_inclusao")
    @Field(value = "timestamp_inclusion")
    private LocalDateTime horaDataInclusao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getHoraDataInclusao() {
        return horaDataInclusao;
    }

    public void setHoraDataInclusao(LocalDateTime horaDataInclusao) {
        this.horaDataInclusao = horaDataInclusao;
    }
}
