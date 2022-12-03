package com.natural.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.natural.model.AffectedUser;
import lombok.Data;

import java.util.ArrayList;

@Data
public class AlarmWrapper {
    @JsonProperty("SiteName")
    public String siteName;
    @JsonProperty("ReturnCode")
    public String returnCode;
    @JsonProperty("ErrorMsg")
    public String errorMsg;
    public String retCode;
    public String retMsg;
    public String retData;
    @JsonProperty("Affected User")
    public ArrayList<AffectedUser> affectedUser;
    @JsonProperty("MSISDN")
    public String mSISDN;

}
