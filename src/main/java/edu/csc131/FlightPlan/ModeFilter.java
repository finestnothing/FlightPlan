package edu.csc131.FlightPlan;

public class ModeFilter {
    private Boolean isCarFilterd = false;
    private Boolean isTransitFilterd = false;
    private Boolean isShuttelFilterd = false;
    private Boolean IsWalkFilterd = false;
    private Boolean isBikeFilterd = false;
    private Boolean isCarpoolFilterd = false;

    public ModeFilter(Double transitDistance){
        if(transitDistance<0){
            isTransitFilterd = true;
        }
    }

    public Boolean getIsCarFilterd() {
        return isCarFilterd;
    }

    public void setIsCarFilterd(Boolean isCarFilterd) {
        this.isCarFilterd = isCarFilterd;
    }

    public Boolean getIsTransitFilterd() {
        return isTransitFilterd;
    }

    public void setIsTransitFilterd(Boolean isTransitFilterd) {
        this.isTransitFilterd = isTransitFilterd;
    }

    public Boolean getIsShuttelFilterd() {
        return isShuttelFilterd;
    }

    public void setIsShuttelFilterd(Boolean isShuttelFilterd) {
        this.isShuttelFilterd = isShuttelFilterd;
    }

    public Boolean getIsWalkFilterd() {
        return IsWalkFilterd;
    }

    public void setIsWalkFilterd(Boolean isWalkFilterd) {
        IsWalkFilterd = isWalkFilterd;
    }

    public Boolean getIsBikeFilterd() {
        return isBikeFilterd;
    }

    public void setIsBikeFilterd(Boolean isBikeFilterd) {
        this.isBikeFilterd = isBikeFilterd;
    }

    public Boolean getIsCarpoolFilterd() {
        return isCarpoolFilterd;
    }

    public void setIsCarpoolFilterd(Boolean isCarpoolFilterd) {
        this.isCarpoolFilterd = isCarpoolFilterd;
    }
}
