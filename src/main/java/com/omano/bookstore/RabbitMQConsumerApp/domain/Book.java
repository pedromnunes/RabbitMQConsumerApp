package com.omano.bookstore.RabbitMQConsumerApp.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {


    @JsonProperty
    private Long id;

    @JsonProperty
    private String title;

    @JsonProperty
    private String author;

    @JsonProperty
    private Double price;

    @JsonProperty
    private String creationTime;

    /*  public Book(Long id, String title, String author, Double price, String creationTime) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.creationTime =  creationTime;
    }  */

    @Override
    public String toString() {
        
        String str = "Book{\n"
                     +"         \"id\": " + this.id +", \n"
                     +"         \"title\": \"" + this.title + "\", \n"
                     +"         \"author\": \"" + this.author + "\", \n"
                     +"         \"price\": " + this.price + ", \n"
                     +"         \"creationTime\": \"" + this.creationTime + "\"\n"
                     +"    }"; 

        return str;
    }
    
    
}
