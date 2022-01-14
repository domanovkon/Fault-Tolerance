package com.example.gateway.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserInfoBonusError {

    @JsonProperty(value = "tickets")
    private List<TicketInformationDTO> ticketInformation;

    @JsonProperty(value = "privilege")
    private List<FlightResponseDTO> privilege;

    public List<TicketInformationDTO> getTicketInformation() {
        return ticketInformation;
    }

    public void setTicketInformation(List<TicketInformationDTO> ticketInformation) {
        this.ticketInformation = ticketInformation;
    }

    public List<FlightResponseDTO> getPrivileges() {
        return privilege;
    }

    public void setPrivileges(List<FlightResponseDTO> privilege) {
        this.privilege = privilege;
    }
}
