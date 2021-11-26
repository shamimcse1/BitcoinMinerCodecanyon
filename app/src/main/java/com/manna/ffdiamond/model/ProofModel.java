package com.manna.ffdiamond.model;

import androidx.annotation.Nullable;

public class ProofModel {

    public int id;
    public String username;
    public String amount;
    @Nullable
    public int getId() {
        return id;
    }
    @Nullable
    public String getUsername() {
        return username;
    }
    @Nullable
    public void setUsername(String username) {
        this.username = username;
    }
    @Nullable
    public String getAmount() {
        return amount;
    }
    @Nullable
    public void setAmount(String amount) {
        this.amount = amount;
    }
}