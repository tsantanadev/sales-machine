package br.com.tsantana.salesmachine.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public record Product(@Id String id, String name, String description, BigDecimal price) {
}
