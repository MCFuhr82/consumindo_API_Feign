package com.blinkspace.ProjetoGFTStarter3.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Activities {

    private String activity;
    private String type;
    private int participants;
}
