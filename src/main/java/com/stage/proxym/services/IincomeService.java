package com.stage.proxym.services;

import com.stage.proxym.entities.Income;

import java.util.List;

public interface IincomeService {
    public Income addIncome(Income i);
    public Income updateIncome(Income i);
    public Income getIncomeById(long idIncome);
    public List<Income> getAll();
    public void deleteIncome(long idIncome);
    public List<Income> retrieveAllIncomes();
}
