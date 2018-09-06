package com.fourchetta.agile.scompa.cucumber.stepdefs;

import com.fourchetta.agile.scompa.SaFeCompanionApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SaFeCompanionApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
