package org.swiftvalar.app;

public class TasklistCard {
    Integer cardNumber;
    String cardTitle;
    String columnName;
    String cardTextContent;

    public TasklistCard(Integer cardNumber, String cardTitle, String columnName, String cardTextContent) {
        this.cardNumber = cardNumber;
        this.cardTitle = cardTitle;
        this.columnName = columnName;
        this.cardTextContent = cardTextContent;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getCardTextContent() {
        return cardTextContent;
    }

    public void setCardTextContent(String cardTextContent) {
        this.cardTextContent = cardTextContent;
    }

}