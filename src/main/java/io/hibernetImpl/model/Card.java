package io.hibernetImpl.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "CARD")
public class Card {

    @Id
    @Column(name = "HOLDER_KEY")
    private String holderKey;
    @Column(name ="CARD_TYPE")
    private String type;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "HOLDER_NAME" )
    private String holderName;
    @Column(name = "AVL_BLNC")
    private double avalBalnc;

    public Card() {

    }

    public Card(String holderKey, String type, String cardNumber, String holderName, double avalBalnc) {
        this.holderKey = holderKey;
        this.type = type;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.avalBalnc = avalBalnc;
    }

    public String getHolderKey() {
        return holderKey;
    }

    public void setHolderKey(String holderKey) {
        this.holderKey = holderKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getAvalBalnc() {
        return avalBalnc;
    }

    public void setAvalBalnc(double avalBalnc) {
        this.avalBalnc = avalBalnc;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderKey=" + holderKey +
                ", type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", avalBalnc=" + avalBalnc +
                '}';
    }
}
