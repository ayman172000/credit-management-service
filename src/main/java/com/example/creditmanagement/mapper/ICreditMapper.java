package com.example.creditmanagement.mapper;

import com.example.creditmanagement.DTO.CreditDTO;
import com.example.creditmanagement.entities.Credit;

public interface ICreditMapper {
    Credit fromCreditDTO(CreditDTO creditDTO);
    CreditDTO fromCredit(Credit credit);
}
