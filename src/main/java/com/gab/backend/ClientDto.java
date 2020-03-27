package com.gab.backend;

import java.util.Date;
import java.util.Objects;

/**
 * Representa a la tabla client
 * DTO: Data transfer Object
 */
public class ClientDto {
    private Integer clientId;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private Boolean status;
    private Integer txId;
    private Integer txDate;
    private Integer txUserId;
    private String txHost;


    public ClientDto() {
    }


    @Override
    public String toString() {
        return "ClientDto{" +
                "clientId=" + clientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", status=" + status +
                ", txId=" + txId +
                ", txDate=" + txDate +
                ", txUserId=" + txUserId +
                ", txHost='" + txHost + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDto clientDto = (ClientDto) o;
        return clientId.equals(clientDto.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    public Integer getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Boolean getStatus() {
        return status;
    }

    public Integer getTxId() {
        return txId;
    }

    public Integer getTxDate() {
        return txDate;
    }

    public Integer getTxUserId() {
        return txUserId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public void setTxDate(Integer txDate) {
        this.txDate = txDate;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }
}
